package LiveNature.Animals.Herbivores;

import LiveNature.Animals.Animal;
import LiveNature.LiveNatureEnum;

public class Caterpillar extends Herbivore{
    public Caterpillar() {
        super(0.01, 1000, 0, 0, LiveNatureEnum.CATERPILLAR.getUnicodeSymbol());
    }
    @Override
    public Animal reproduce() {
        return new Caterpillar();
    }
}
