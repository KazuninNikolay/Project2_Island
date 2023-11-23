package LiveNature.Animals.Predators;

import LiveNature.Animals.Animal;
import LiveNature.Animals.Herbivores.Buffalo;
import LiveNature.Interface.LiveNature;

public abstract class Predator extends Animal implements LiveNature {

    public Predator(double weight, int maxNumberPerCell, double amountOfFoodToSatiate, int speed) {
        super(weight, maxNumberPerCell, amountOfFoodToSatiate, speed);
    }
}
