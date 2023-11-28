package simulation;

import dialogMenu.UserDialog;
import island.IslandController;
import island.IslandMap;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

public class SimulationStarter {

    private final UserDialog userDialog;
    private final SimulationSettings settings;
    private final IslandMap islandMap;
    private final IslandController controller;
    private final SimulationAction simulationAction;

    public SimulationStarter() {
        this.settings = new SimulationSettings();
        this.userDialog = new UserDialog(settings);
        this.islandMap = new IslandMap(settings.getHeightMap(),
                settings.getWidthMap(),
                settings.getNUMBER_ANIMAL_AT_CREATION());
        this.controller = new IslandController(islandMap, settings);
        this.simulationAction = new SimulationAction(islandMap.getLocations(), settings, islandMap);
    }

    public void start() {

        controller.getMap().initialize();
        controller.getMap().creationOfLive();
        System.out.println("------------");
        islandMap.printCurrentFieldState();
        simulationAction.liveCycle();
        System.out.println("------------");
        islandMap.printCurrentFieldState();
    }

    public UserDialog getUserDialog() {
        return userDialog;
    }

    public SimulationSettings getSettings() {
        return settings;
    }

    public IslandMap getIslandMap() {
        return islandMap;
    }

    public IslandController getController() {
        return controller;
    }
}
