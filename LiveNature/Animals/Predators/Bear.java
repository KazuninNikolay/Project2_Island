package LiveNature.Animals.Predators;

import LiveNature.Animals.Animal;
import LiveNature.LiveNatureEnum;

public class Bear extends Predator {

    public Bear() {
        super(500, 5, 80, 2,  LiveNatureEnum.BEAR.getUnicodeSymbol());
    }

    @Override
    public Animal reproduce() {
        return new Bear();
    }
}
