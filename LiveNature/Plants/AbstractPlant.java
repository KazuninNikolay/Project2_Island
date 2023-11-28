package LiveNature.Plants;

import LiveNature.Interface.LiveNature;

public abstract class AbstractPlant implements LiveNature {
    private final double weight;
    private final int maxNumberPerCell;
    private final String unicode;

    public double getWeight() {
        return weight;
    }

    public AbstractPlant(double weight, int maxNumberPerCell, String unicode) {
        this.weight = weight;
        this.maxNumberPerCell = maxNumberPerCell;
        this.unicode = unicode;
    }

    public int getMaxNumberPerCell() {
        return maxNumberPerCell;
    }

    @Override
    public String toString() {
        return unicode;
    }
}
