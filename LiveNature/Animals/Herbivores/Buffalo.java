package LiveNature.Animals.Herbivores;

import LiveNature.Animals.Animal;
import LiveNature.LiveNatureEnum;

public class Buffalo extends Herbivore {
    public Buffalo() {
        super(700, 10, 100, 3, LiveNatureEnum.BUFFALO.getUnicodeSymbol());
    }

    @Override
    public Animal reproduce() {
        return new Buffalo();
    }
}
