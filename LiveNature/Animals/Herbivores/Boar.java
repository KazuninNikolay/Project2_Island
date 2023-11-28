package LiveNature.Animals.Herbivores;

import LiveNature.Animals.Animal;
import LiveNature.LiveNatureEnum;

public class Boar extends Herbivore {
    @Override
    public Animal reproduce() {
        return new Boar();
    }

    public Boar() {
        super(400, 50, 50, 2, LiveNatureEnum.BOAR.getUnicodeSymbol());
    }
}
