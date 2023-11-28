package LiveNature.Animals.Predators;

import LiveNature.Animals.Animal;
import LiveNature.LiveNatureEnum;

public class Boa extends Predator {
    public Boa() {
        super(15, 30, 3, 1,  LiveNatureEnum.BOA.getUnicodeSymbol());
    }

    @Override
    public Animal reproduce() {
        return new Boa();
    }
}
