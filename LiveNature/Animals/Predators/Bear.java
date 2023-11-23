package LiveNature.Animals.Predators;

import LiveNature.Animals.Animal;
import LiveNature.Animals.Herbivores.Buffalo;

public class Bear extends Predator {

    public Bear() {
        super(500, 5, 80, 2);
    }
    @Override
    public Animal reproduce() {
        return new Bear();
    }
}
