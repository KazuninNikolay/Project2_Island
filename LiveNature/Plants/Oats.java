package LiveNature.Plants;

import LiveNature.Interface.LiveNature;
import LiveNature.LiveNatureEnum;

public class Oats extends AbstractPlant{
    public Oats() {
        super(3, 100, LiveNatureEnum.OATS.getUnicodeSymbol());
    }

    @Override
    public LiveNature reproduce() {
        return new Oats();
    }
}
