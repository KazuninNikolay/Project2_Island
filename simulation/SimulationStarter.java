package simulation;

import dialogMenu.UserDialog;
import island.IslandController;
import island.IslandMap;
import settings.EatingMap;

public class SimulationStarter {
    private final UserDialog userDialog;
    private final SimulationSettings settings;
    private final IslandMap islandMap;
    private final IslandController controller;
    private final EatingMap eatingMap;

    public SimulationStarter() {
        this.settings = new SimulationSettings();
        this.userDialog = new UserDialog(settings);
        this.islandMap = new IslandMap(settings.getHeightMap(),
                settings.getWidthMap(),
                settings.getInitialEntityOnCell());
        this.eatingMap = new EatingMap();
        this.controller = new IslandController(islandMap, eatingMap, settings);
    }
    public void start() {
        controller.getMap().initialize();
        controller.getMap().creationOfLive();
        System.out.println();
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
