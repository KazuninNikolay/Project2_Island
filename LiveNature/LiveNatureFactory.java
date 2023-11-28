package LiveNature;

import LiveNature.Animals.Herbivores.*;
import LiveNature.Animals.Predators.*;
import LiveNature.Interface.LiveNature;
import LiveNature.Plants.Grass;
import LiveNature.Plants.Oats;

public class LiveNatureFactory {
    public LiveNature createLiveNature(LiveNatureEnum entity) {
        return switch (entity) {
            case BOA -> new Boa();
            case FOX -> new Fox();
            case BEAR -> new Bear();
            case BOAR -> new Boar();
            case DEER -> new Deer();
            case DUCK -> new Duck();
            case GOAT -> new Goat();
            case WOLF -> new Wolf();
            case EAGLE -> new Eagle();
            case HORSE -> new Horse();
            case MOUSE -> new Mouse();
            case SHEEP -> new Sheep();
            case RABBIT -> new Rabbit();
            case BUFFALO -> new Buffalo();
            case CATERPILLAR -> new Caterpillar();
            case OATS -> new Oats();
            case GRASS -> new Grass();
        };
    }
}
