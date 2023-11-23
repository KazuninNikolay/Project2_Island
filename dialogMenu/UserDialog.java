package dialogMenu;

import simulation.SimulationSettings;

import java.util.Scanner;

public class UserDialog {
    private final SimulationSettings settings;

    public SimulationSettings getSettings() {
        return settings;
    }

    public UserDialog(SimulationSettings settings) {
        this.settings = new SimulationSettings();

        homeMenu(settings);

    }


    private static void homeMenu(SimulationSettings settings) {
        System.out.println("Добро пожаловать в симуляцию острова, текущие настройки симуляции: ");
        System.out.println("Высота поля: " + settings.getHeightMap() + "\nШирина поля: " + settings.getWidthMap()
                + "\nНачальное количество животных на одной клентке не более: " + settings.getInitialEntityOnCell());
        System.out.println("Если желаете изменить текущие настройки введите: 1\n"
                + "Запустить симуляцию с текущими настройками, нажмите: 2");
        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.nextInt() == 1) {
                System.out.println("Введите новую высоту поля:");
                settings.setHeightMap(scanner.nextInt());
                System.out.println("Введите новую ширину поля:");
                settings.setWidthMap(scanner.nextInt());
                System.out.println("Введите начальное количество животных на одной клетке:");
                settings.setInitialEntityOnCell(scanner.nextInt());
            }
        }
    }
}