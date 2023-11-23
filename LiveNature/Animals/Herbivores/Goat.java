package LiveNature.Animals.Herbivores;

import LiveNature.Animals.Animal;

public class Goat extends Herbivore{
    public Goat() {
        super(60, 140, 10, 3);
    }
    @Override
    public Animal reproduce() {
        return new Goat();
    }
}
