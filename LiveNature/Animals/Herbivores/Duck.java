package LiveNature.Animals.Herbivores;

import LiveNature.Animals.Animal;
import LiveNature.LiveNatureEnum;

public class Duck extends Herbivore{
    public Duck() {
        super(1, 200, 0.15, 4, LiveNatureEnum.DUCK.getUnicodeSymbol());
    }
    @Override
    public Animal reproduce() {
        return new Duck();
    }
}
