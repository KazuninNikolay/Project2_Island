package dialogMenu;

import simulation.SimulationSettings;

import java.util.Scanner;

public class UserDialog {
    private final SimulationSettings settings;

    public UserDialog(SimulationSettings settings) {
        this.settings = new SimulationSettings();

        homeMenu(settings);

    }


    private static void homeMenu(SimulationSettings settings) {
        System.out.println("Добро пожаловать в симуляцию острова, текущие настройки симуляции: ");
        System.out.println("Высота поля: " + settings.getHeightMap() + "\nШирина поля: " + settings.getWidthMap()
                + "\nНачальное количество животных на одной клентке не более: " + settings.getNUMBER_ANIMAL_AT_CREATION() 
                + "\nКоличество видов животных в конце симуляции: " + settings.getNUMBER_ANIMALS_GAMEOVER()
                + "\nМаксимальное количество итераций: " + settings.getNUMBER_ITERATIONS() 
                + "\nШансы на размножение: " + settings.getCHANCE_TO_REPRODUCE()
                + "\nСнижение здоровья при каждом ходе, на: " + settings.getDECLINE_IN_HEALTH() + "%.");
        
        System.out.println("Если желаете изменить текущие настройки введите: 1\n"
                + "Запустить симуляцию с текущими настройками, введите любое друое число");
        try (Scanner scanner = new Scanner(System.in)) {
           int numMenu = scanner.nextInt();
            if ( numMenu== 1) {
                System.out.println("Введите новую высоту поля:");
                settings.setHeightMap(scanner.nextInt());
                System.out.println("Введите новую ширину поля:");
                settings.setWidthMap(scanner.nextInt());
                System.out.println("Введите начальное количество животных на одной клетке:");
                settings.setNUMBER_ANIMAL_AT_CREATION(scanner.nextInt());
                System.out.println("Введите количетсво оставшихся видов, в конце симуляции: ");
                settings.setNUMBER_ANIMALS_GAMEOVER(scanner.nextInt());
                System.out.println("Введите максимальное количество итераций:");
                settings.setNUMBER_ITERATIONS(scanner.nextInt());
                System.out.println("Введите максимальные шансы на успешное размножение:");
                settings.setCHANCE_TO_REPRODUCE(scanner.nextInt());
                System.out.println("Введите значение для понижения здоровья:");
                settings.setDECLINE_IN_HEALTH(scanner.nextInt());
            }
        }
    }
}