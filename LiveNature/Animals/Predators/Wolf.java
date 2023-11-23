package LiveNature.Animals.Predators;

import LiveNature.Animals.Animal;
import LiveNature.Animals.Herbivores.Buffalo;

public class Wolf extends Predator {
    public Wolf() {
        super(50, 30, 8, 3);
    }
    @Override
    public Animal reproduce() {
        return new Wolf();
    }
}
