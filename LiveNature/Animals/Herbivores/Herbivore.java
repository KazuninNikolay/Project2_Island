package LiveNature.Animals.Herbivores;

import LiveNature.Animals.Animal;
import LiveNature.Interface.LiveNature;

public abstract class Herbivore extends Animal implements LiveNature {
    public Herbivore(double weight, int maxNumberPerCell, double amountOfFoodToSatiate, int speed) {
        super(weight, maxNumberPerCell, amountOfFoodToSatiate, speed);
    }
}
