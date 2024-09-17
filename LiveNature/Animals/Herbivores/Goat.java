package LiveNature.Animals.Herbivores;

import LiveNature.Animals.Animal;
import LiveNature.LiveNatureEnum;

public class Goat extends Herbivore{
    public Goat() {
        super(60, 140, 10, 3, LiveNatureEnum.GOAT.getUnicodeSymbol());
    }
    @Override
    public Animal reproduce() {
        return new Goat();
    }
}
