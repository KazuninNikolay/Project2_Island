package LiveNature.Animals.Predators;

import LiveNature.Animals.Animal;
import LiveNature.Animals.Herbivores.Boar;
import LiveNature.Animals.Herbivores.Buffalo;

public class Boa extends Predator{
    public Boa() {
        super(15, 30, 3, 1);
    }
    @Override
    public Animal reproduce() {
        return new Boa();
    }
}
