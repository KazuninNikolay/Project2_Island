package LiveNature.Animals.Herbivores;

import LiveNature.Animals.Animal;
import LiveNature.LiveNatureEnum;

public class Sheep extends Herbivore {
    public Sheep() {
        super(70, 140, 15, 3, LiveNatureEnum.SHEEP.getUnicodeSymbol());
    }

    @Override
    public Animal reproduce() {
        return new Sheep();
    }
}
