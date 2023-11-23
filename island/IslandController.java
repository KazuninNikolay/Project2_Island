package island;

import settings.EatingMap;
import simulation.SimulationSettings;

public class IslandController {
    private final IslandMap map;

    public IslandMap getMap() {
        return map;
    }

    public EatingMap getEatingMap() {
        return eatingMap;
    }

    public SimulationSettings getSettings() {
        return settings;
    }

    private final EatingMap eatingMap;
    private final SimulationSettings settings;

    public IslandController(IslandMap map, EatingMap eatingMap, SimulationSettings settings) {
        this.map = map;
        this.eatingMap = eatingMap;
        this.settings = settings;
    }
}
