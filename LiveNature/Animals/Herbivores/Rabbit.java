package LiveNature.Animals.Herbivores;

import LiveNature.Animals.Animal;

public class Rabbit extends Herbivore {
    public Rabbit() {
        super(2, 150, 0.45, 2);
    }
    @Override
    public Animal reproduce() {
        return new Rabbit();
    }
}
