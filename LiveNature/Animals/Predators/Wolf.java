package LiveNature.Animals.Predators;

import LiveNature.Animals.Animal;
import LiveNature.LiveNatureEnum;

public class Wolf extends Predator {
    public Wolf() {
        super(50, 30, 8, 3,  LiveNatureEnum.WOLF.getUnicodeSymbol());
    }

    @Override
    public Animal reproduce() {
        return new Wolf();
    }
}
