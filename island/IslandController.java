package island;

import simulation.SimulationSettings;

import java.util.Map;

public class IslandController {
    private final IslandMap map;

    public IslandMap getMap() {
        return map;
    }

    public IslandController(IslandMap map, SimulationSettings settings) {
        this.map = map;
        Map<String, Map<String, Integer>> percentOfEating = settings.getPercentOfEating();
    }
}
