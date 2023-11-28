package LiveNature.Animals.Predators;

import LiveNature.Animals.Animal;
import LiveNature.LiveNatureEnum;

public class Eagle extends Predator {

    public Eagle() {
        super(6, 20, 1, 3,  LiveNatureEnum.EAGLE.getUnicodeSymbol());
    }

    @Override
    public Animal reproduce() {
        return new Eagle();
    }
}
