package LiveNature.Animals.Herbivores;

import LiveNature.Animals.Animal;

public class Deer extends Herbivore {
    public Deer() {
        super(300, 20, 50, 4);
    }

    @Override
    public Animal reproduce() {
        return new Deer();
    }
}
