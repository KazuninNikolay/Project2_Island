package LiveNature.Animals.Herbivores;

import LiveNature.Animals.Animal;

public class Buffalo extends Herbivore {
    public Buffalo() {
        super(700, 10, 100, 3);
    }

    @Override
    public Animal reproduce() {
        return new Buffalo();
    }
}
