package LiveNature.Animals.Predators;

import LiveNature.Animals.Animal;
import LiveNature.Animals.Herbivores.Buffalo;

public class Fox extends Predator {

    public Fox() {
        super(8, 30, 2, 2);
    }
    @Override
    public Animal reproduce() {
        return new Fox();
    }
}
