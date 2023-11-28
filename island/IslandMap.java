package island;

import LiveNature.LiveNatureEnum;
import LiveNature.Interface.LiveNature;
import LiveNature.LiveNatureFactory;

import java.util.concurrent.ThreadLocalRandom;

public class IslandMap {
    private final int height;
    private final int width;

    public Location[][] getLocations() {
        return locations;
    }

    private final Location[][] locations;
    private final LiveNatureFactory creator;
    private final int INITIAL_ENTITY_ON_CELL;

    public IslandMap(int height, int width, int initialEntityOnCell) {
        this.height = height;
        this.width = width;
        this.INITIAL_ENTITY_ON_CELL = initialEntityOnCell;
        this.locations = new Location[height][width];
        this.creator = new LiveNatureFactory();
    }

    public void initialize() {
        for (int coordY = 0; coordY < height; coordY++) {
            for (int coordX = 0; coordX < width; coordX++) {
                locations[coordY][coordX] = new Location(coordX, coordY);
            }
        }
    }

    public void creationOfLive() {
        for (int coordY = 0; coordY < height; coordY++) {
            for (int coordX = 0; coordX < width; coordX++) {
                for (int i = 0; i < INITIAL_ENTITY_ON_CELL; i++) {
                    LiveNature entity = getRandomEntity();
                    String entityClassNameOfString = entity.getClass().getSimpleName();
                    int entityCountOnCell = locations[coordY][coordX].getEntitiesStaticCount()
                            .getOrDefault(entityClassNameOfString, 0);
                    if (entityCountOnCell > entity.getMaxNumberPerCell()) {
                        continue;
                    }
                    locations[coordY][coordX].addEntity(entity);
                }
            }
        }
    }

    public void printCurrentFieldState() {
        for (int coordY = 0; coordY < getLocations().length; coordY++) {
            for (int coordX = 0; coordX < getLocations()[coordY].length; coordX++) {
                System.out.print(getLocations()[coordY][coordX].getEntities());
            }
            System.out.println();
        }
    }

    private LiveNature getRandomEntity() {
        LiveNatureEnum[] entityClass = LiveNatureEnum.values();
        LiveNatureEnum entity = entityClass[ThreadLocalRandom.current().nextInt(entityClass.length)];
        return creator.createLiveNature(entity);
    }

}
