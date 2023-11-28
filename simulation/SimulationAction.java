package simulation;

import LiveNature.Animals.Animal;
import LiveNature.Animals.Direction;
import LiveNature.Interface.LiveNature;
import LiveNature.Plants.Grass;
import island.IslandMap;
import island.Location;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class SimulationAction {
    private final Map<String, Map<String, Integer>> percentOfEating;
    private final Location[][] locations;
    private final SimulationSettings settings;
    private final int CHANCE_TO_REPRODUCE;
    private final int DECLINE_IN_HEALTH;
    private final int NUMBER_ANIMALS_GAMEOVER;
    private int NUMBER_ITERATIONS;
    private final List<LiveNature> deathList = new ArrayList<>();

    public void liveCycle() {
        boolean isLiveAnimal = true;
        while (NUMBER_ITERATIONS > 1 && isLiveAnimal) {
            int live = 0;
            for (int coordY = 0; coordY < locations.length; coordY++) {
                for (int coordX = 0; coordX < locations[coordY].length; coordX++) {
                    List<LiveNature> foodToCheck = locations[coordY][coordX].getEntities();
                    recoveryPlant(coordY, coordX);
                    for (Animal animal : locations[coordY][coordX].getAnimals()) {
                        healthDown(animal);
                        if (animal.getHealthScale() > 0) {
                            LiveNature food = getRandomEat(animal, foodToCheck);
                            animal.eat(food);
                            death(coordY, coordX, food);
                            randomReproduce(coordY, coordX, animal);
                            doWalk(animal, animal.walk(), locations[coordY][coordX]);
                        } else {
                            death(coordY, coordX, animal);
                        }
                    }
                    live += locations[coordY][coordX].getAnimals().size();
                }
            }
            isLiveAnimal = live > NUMBER_ANIMALS_GAMEOVER;
            NUMBER_ITERATIONS--;
        }
    }

    private void doWalk(Animal animal, List<Direction> directions, Location location) {
        for (Direction direction : directions) {
            switch (direction) {
                case UP -> stepUp(animal, location);
                case DOWN -> stepDown(animal, location);
                case RIGHT -> stepRight(animal, location);
                case LEFT -> stepLeft(animal, location);
            }
        }
    }

    private void stepUp(Animal animal, Location location) {
        if (location.getCoordY() != 0) {
            locations[location.getCoordY() - 1][location.getCoordX()].addEntity(animal);
            location.removeEntity(animal);
        }
    }

    private void stepDown(Animal animal, Location location) {
        if (location.getCoordY() < settings.getHeightMap() - 1) {
            locations[location.getCoordY() + 1][location.getCoordX()].addEntity(animal);
            location.removeEntity(animal);
        }
    }

    private void stepRight(Animal animal, Location location) {
        if (location.getCoordX() < settings.getWidthMap() - 1) {
            locations[location.getCoordY()][location.getCoordX() + 1].addEntity(animal);
            location.removeEntity(animal);
        }
    }

    private void stepLeft(Animal animal, Location location) {
        if (location.getCoordX() != 0) {
            locations[location.getCoordY()][location.getCoordX() - 1].addEntity(animal);
            location.removeEntity(animal);
        }
    }

    private void randomReproduce(int coordY, int coordX, Animal animal) {
        int sumEntityOnCell =
                locations[coordY][coordX].getEntitiesStaticCount().get(getSimpleName(animal)) != null ?
                        locations[coordY][coordX].getEntitiesStaticCount().get(getSimpleName(animal)) : 0;
        if (sumEntityOnCell > 2 && getRandomReproduce()) {
            locations[coordY][coordX].addEntity(animal.reproduce());
        }
    }

    private boolean getRandomReproduce() {
        int MAX_CHANCE = 100;
        return ThreadLocalRandom.current().nextInt(MAX_CHANCE) < CHANCE_TO_REPRODUCE;
    }

    private void recoveryPlant(int coordY, int coordX) {
        if (locations[coordY][coordX].getPlants().isEmpty()) {
            locations[coordY][coordX].addEntity(new Grass());
        }
    }

    private void death(int coordY, int coordX, LiveNature entity) {
        if (entity != null) {
            deathList.add(entity);
            locations[coordY][coordX].removeEntity(entity);
        }
    }


    private void healthDown(Animal animal) {
        animal.setHealthScale(animal.getHealthScale() - DECLINE_IN_HEALTH);
    }

    private LiveNature getRandomEat(Animal eater, List<LiveNature> foodToCheck) {

        List<LiveNature> edibleFood = new ArrayList<>();
        for (LiveNature liveNature : foodToCheck) {
            if (percentOfEating.get(getSimpleName(eater))
                    .containsKey(getSimpleName(liveNature))) {
                edibleFood.add(liveNature);
            }
        }
        if (edibleFood.size() == 0) {
            return null;
        } else {
            int indexRandom = ThreadLocalRandom.current().nextInt(edibleFood.size());
            if (eatingCheck(edibleFood.get(indexRandom), eater)) {
                return edibleFood.get(indexRandom);
            } else {
                return null;
            }
        }
    }

    private boolean eatingCheck(LiveNature food, LiveNature eater) {
        return ThreadLocalRandom.current().nextInt(100) > getValuePercentEatable(food, eater);
    }

    private Integer getValuePercentEatable(LiveNature food, LiveNature eater) {
        return percentOfEating.get(getSimpleName(eater)).get(getSimpleName(food));
    }

    private static String getSimpleName(LiveNature liveNature) {
        return liveNature.getClass().getSimpleName();
    }

    public SimulationAction(SimulationSettings settings, IslandMap islandMap) {
        this.locations = islandMap.getLocations();
        this.settings = settings;
        this.percentOfEating = settings.getPercentOfEating();
        this.NUMBER_ITERATIONS = settings.getNUMBER_ITERATIONS();
        this.NUMBER_ANIMALS_GAMEOVER = settings.getNUMBER_ANIMALS_GAMEOVER();
        this.CHANCE_TO_REPRODUCE = settings.getCHANCE_TO_REPRODUCE();
        this.DECLINE_IN_HEALTH = settings.getDECLINE_IN_HEALTH();
    }
}
