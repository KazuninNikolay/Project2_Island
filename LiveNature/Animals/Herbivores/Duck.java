package LiveNature.Animals.Herbivores;

import LiveNature.Animals.Animal;

public class Duck extends Herbivore{
    public Duck() {
        super(1, 200, 0.15, 4);
    }
    @Override
    public Animal reproduce() {
        return new Duck();
    }
}
