package island;

import LiveNature.Animals.Animal;
import LiveNature.Interface.LiveNature;
import LiveNature.Plants.AbstractPlant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Location {
    private final int coordX;
    private final int coordY;
    private final List<LiveNature> entities;
    private final Map<String, Integer> entitiesStaticCount;

    public Map<String, Integer> getEntitiesStaticCount() {
        return entitiesStaticCount;
    }

    public void addEntity(LiveNature entity) {
        this.entities.add(entity);

        addToStatistics(entity);
    }

    public void removeEntity(LiveNature entity) {
        this.entities.remove(entity);

        removeFromStatistics(entity);
    }

    private void removeFromStatistics(LiveNature entity) {
        String entityClassNameOfString = getEntityClassName(entity);
        entitiesStaticCount.merge(entityClassNameOfString, 1, (oldValue, newValue) -> {
            int newCount = oldValue - 1;
            if (newCount <= 0) {
                return null;
            } else {
                return newCount;
            }
        });
    }

    private void addToStatistics(LiveNature entity) {
        String entityClassNameOfString = getEntityClassName(entity);
        entitiesStaticCount.merge(entityClassNameOfString, 1, (oldValue, newValue) -> oldValue + 1);
    }


    private static String getEntityClassName(LiveNature entity) {
        return entity.getClass().getSimpleName();
    }

    public List<Animal> getAnimals() {
        return this.entities.stream()
                .filter(Animal.class::isInstance)
                .map(el -> (Animal) el)
                .toList();
    }

    public List<AbstractPlant> getPlants() {
        return this.entities.stream()
                .filter(AbstractPlant.class::isInstance)
                .map(el -> (AbstractPlant) el)
                .toList();
    }

    public int getCoordX() {
        return coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public List<LiveNature> getEntities() {
        return entities;
    }

    public Location(int coordX, int coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.entities = new ArrayList<>();
        this.entitiesStaticCount = new HashMap<>();
    }
}
