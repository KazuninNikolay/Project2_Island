package LiveNature.Animals.Herbivores;

import LiveNature.Animals.Animal;

public class Sheep extends Herbivore{
    public Sheep() {
        super(70, 140, 15, 3);
    }
    @Override
    public Animal reproduce() {
        return new Sheep();
    }
}
