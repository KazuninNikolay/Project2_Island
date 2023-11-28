package LiveNature.Animals.Herbivores;

import LiveNature.Animals.Animal;
import LiveNature.LiveNatureEnum;

public class Deer extends Herbivore {
    public Deer() {
        super(300, 20, 50, 4, LiveNatureEnum.DEER.getUnicodeSymbol());
    }

    @Override
    public Animal reproduce() {
        return new Deer();
    }
}
