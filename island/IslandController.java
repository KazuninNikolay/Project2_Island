package island;

import simulation.SimulationSettings;

import java.util.Map;

public class IslandController {
    private final Map<String, Map<String, Integer>> percentOfEating;
    private final SimulationSettings settings;
    private final IslandMap map;

    public IslandMap getMap() {
        return map;
    }

    public IslandController(IslandMap map, SimulationSettings settings) {
        this.map = map;
        this.percentOfEating = settings.getPercentOfEating();
        this.settings = settings;
    }
}
