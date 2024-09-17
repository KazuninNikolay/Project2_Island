package LiveNature.Animals.Herbivores;

import LiveNature.Animals.Animal;
import LiveNature.LiveNatureEnum;

public class Horse extends Herbivore {
    public Horse() {
        super(400, 20, 60, 4, LiveNatureEnum.HORSE.getUnicodeSymbol());
    }
    @Override
    public Animal reproduce() {
        return new Horse();
    }
}
