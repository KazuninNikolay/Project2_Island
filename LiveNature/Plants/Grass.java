package LiveNature.Plants;

import LiveNature.LiveNatureEnum;
import LiveNature.Interface.LiveNature;

public class Grass extends AbstractPlant {
    public Grass() {
        super(1, 200, LiveNatureEnum.GRASS.getUnicodeSymbol());
    }

    @Override
    public LiveNature reproduce() {
        return new Grass();
    }
}
