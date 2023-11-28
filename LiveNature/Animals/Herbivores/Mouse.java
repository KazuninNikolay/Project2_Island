package LiveNature.Animals.Herbivores;

import LiveNature.Animals.Animal;
import LiveNature.LiveNatureEnum;

public class Mouse extends Herbivore{
    public Mouse() {
        super(0.05, 500, 0.01, 1,  LiveNatureEnum.MOUSE.getUnicodeSymbol());
    }
    @Override
    public Animal reproduce() {
        return new Mouse();
    }
}
