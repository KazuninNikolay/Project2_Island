package LiveNature.Animals;

import LiveNature.Interface.LiveNature;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Animal implements LiveNature {
    private final double weight;
    private final int maxNumberPerCell;
    private final double amountOfFoodToSatiate;
    private final int speed;
    private double healthScale;
    private final double FULL_HEALTH = 100;
    public void walk() {

    }

/**  Если вес съедаемого животного больше или равно необходимому количеству для насыщения,
 * то здоровье востанавливается полностью, иначе на процент съеденной пищи от необходимого количенства,
 * но не больше 100%.
 * */
    public void eat(LiveNature food) {
        if (food.getWeight() >= this.amountOfFoodToSatiate) {
            this.setHealthScale(FULL_HEALTH);
        } else {
            double restorationOfSaturation =
                    this.getHealthScale() + ((food.getWeight() / this.amountOfFoodToSatiate) * 100);
            this.setHealthScale(Math.min(restorationOfSaturation, FULL_HEALTH));
        }
    }

    public Action choiceOfAction() {
        return Action.values()[ThreadLocalRandom.current()
                .nextInt(Action.values().length)];
    }

    public Direction choiceOfDirection() {
        return Direction.values()[ThreadLocalRandom.current()
                .nextInt(Direction.values().length)];
    }

    public Animal(double weight, int maxNumberPerCell, double amountOfFoodToSatiate, int speed) {
        this.weight = weight;
        this.maxNumberPerCell = maxNumberPerCell;
        this.amountOfFoodToSatiate = amountOfFoodToSatiate;
        this.speed = speed;
        this.healthScale = FULL_HEALTH;
    }

    public double getWeight() {
        return weight;
    }

    public int getMaxNumberPerCell() {
        return maxNumberPerCell;
    }

    public double getAmountOfFoodToSatiate() {
        return amountOfFoodToSatiate;
    }

    public int getSpeed() {
        return speed;
    }

    public double getHealthScale() {
        return healthScale;
    }

    public void setHealthScale(double healthScale) {
        this.healthScale = healthScale;
    }
}
