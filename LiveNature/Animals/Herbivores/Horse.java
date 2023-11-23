package LiveNature.Animals.Herbivores;

import LiveNature.Animals.Animal;

public class Horse extends Herbivore {
    public Horse() {
        super(400, 20, 60, 4);
    }
    @Override
    public Animal reproduce() {
        return new Horse();
    }
}
