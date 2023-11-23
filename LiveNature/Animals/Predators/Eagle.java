package LiveNature.Animals.Predators;

import LiveNature.Animals.Animal;
import LiveNature.Animals.Herbivores.Buffalo;

public class Eagle extends Predator {

    public Eagle() {
        super(6, 20, 1, 3);
    }
    @Override
    public Animal reproduce() {
        return new Eagle();
    }
}
