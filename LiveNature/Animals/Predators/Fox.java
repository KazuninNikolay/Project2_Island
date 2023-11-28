package LiveNature.Animals.Predators;

import LiveNature.Animals.Animal;
import LiveNature.LiveNatureEnum;

public class Fox extends Predator {

    public Fox() {
        super(8, 30, 2, 2,  LiveNatureEnum.FOX.getUnicodeSymbol());
    }

    @Override
    public Animal reproduce() {
        return new Fox();
    }
}
