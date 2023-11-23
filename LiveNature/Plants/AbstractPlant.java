package LiveNature.Plants;

import LiveNature.Interface.LiveNature;

public abstract class AbstractPlant implements LiveNature {
    private final double weight;
    private final int maxNumberPerCell;

    public double getWeight() {
        return weight;
    }

    public AbstractPlant(double weight, int maxNumberPerCell) {
        this.weight = weight;
        this.maxNumberPerCell = maxNumberPerCell;
    }

    public int getMaxNumberPerCell() {
        return maxNumberPerCell;
    }
}
