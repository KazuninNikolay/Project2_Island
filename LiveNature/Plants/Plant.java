package LiveNature.Plants;

import LiveNature.Interface.LiveNature;

public class Plant extends AbstractPlant {
    public Plant() {
        super(1, 200);
    }

    @Override
    public LiveNature reproduce() {
        return new Plant();
    }
}
