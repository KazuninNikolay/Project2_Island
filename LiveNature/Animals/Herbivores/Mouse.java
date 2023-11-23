package LiveNature.Animals.Herbivores;

import LiveNature.Animals.Animal;

public class Mouse extends Herbivore{
    public Mouse() {
        super(0.05, 500, 0.01, 1);
    }
    @Override
    public Animal reproduce() {
        return new Mouse();
    }
}
