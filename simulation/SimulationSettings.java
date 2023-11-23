package simulation;

public class SimulationSettings {
    private int widthMap = 100;
    private int heightMap = 20;
    /**
     * Количество сущностей на каждой клетке в начале симуляции.
     * */
    private int initialEntityOnCell = 100;
    public int getWidthMap() {
        return widthMap;
    }

    public void setWidthMap(int widthMap) {
        this.widthMap = widthMap;
    }

    public int getHeightMap() {
        return heightMap;
    }

    public void setHeightMap(int heightMap) {
        this.heightMap = heightMap;
    }

    public int getInitialEntityOnCell() {
        return initialEntityOnCell;
    }

    public void setInitialEntityOnCell(int initialEntityOnCell) {
        this.initialEntityOnCell = initialEntityOnCell;
    }
}
