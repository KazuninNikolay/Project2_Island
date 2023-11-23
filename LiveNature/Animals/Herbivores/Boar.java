package LiveNature.Animals.Herbivores;

import LiveNature.Animals.Animal;

public class Boar extends Herbivore {
    @Override
    public Animal reproduce() {
        return new Boar();
    }

    public Boar() {
        super(400, 50, 50, 2);
    }
}
