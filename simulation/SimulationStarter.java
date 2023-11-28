package simulation;

import dialogMenu.UserDialog;
import island.IslandController;
import island.IslandMap;

public class SimulationStarter {
    private final IslandMap islandMap;
    private final IslandController controller;
    private final SimulationAction simulationAction;

    public void start() {

        controller.getMap().initialize();
        controller.getMap().creationOfLive();
        islandMap.printCurrentFieldState();
        simulationAction.liveCycle();
        islandMap.printCurrentFieldState();

    }
    public SimulationStarter() {
        SimulationSettings settings = new SimulationSettings();
        UserDialog userDialog = new UserDialog(settings);
        this.islandMap = new IslandMap(settings.getHeightMap(),
                settings.getWidthMap(),
                settings.getNUMBER_ANIMAL_AT_CREATION());
        this.controller = new IslandController(islandMap, settings);
        this.simulationAction = new SimulationAction(settings, islandMap);
    }
}
