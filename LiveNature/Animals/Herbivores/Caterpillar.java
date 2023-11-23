package LiveNature.Animals.Herbivores;

import LiveNature.Animals.Animal;

public class Caterpillar extends Herbivore{
    public Caterpillar() {
        super(0.01, 1000, 0, 0);
    }
    @Override
    public Animal reproduce() {
        return new Caterpillar();
    }
}
