package LiveNature.Animals.Herbivores;

import LiveNature.Animals.Animal;
import LiveNature.LiveNatureEnum;

public class Rabbit extends Herbivore {
    public Rabbit() {
        super(2, 150, 0.45, 2,  LiveNatureEnum.RABBIT .getUnicodeSymbol());
    }
    @Override
    public Animal reproduce() {
        return new Rabbit();
    }
}
