package simulation;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import settings.EatingMap;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SimulationSettings {
    private int widthMap = 100;
    private int heightMap = 20;
    private int CHANCE_TO_REPRODUCE = 30;
    private int DECLINE_IN_HEALTH = 30;
    private int NUMBER_ITERATIONS = 500;
    private int NUMBER_ANIMALS_GAMEOVER = 0;
    /**
     * Количество сущностей на каждой клетке в начале симуляции.
     */
    private int NUMBER_ANIMAL_AT_CREATION = 2;
    public int getNUMBER_ANIMALS_GAMEOVER() {
        return NUMBER_ANIMALS_GAMEOVER;
    }

    public void setNUMBER_ANIMALS_GAMEOVER(int NUMBER_ANIMALS_GAMEOVER) {
        this.NUMBER_ANIMALS_GAMEOVER = NUMBER_ANIMALS_GAMEOVER;
    }

    public int getNUMBER_ITERATIONS() {
        return NUMBER_ITERATIONS;
    }

    public void setNUMBER_ITERATIONS(int NUMBER_ITERATIONS) {
        this.NUMBER_ITERATIONS = NUMBER_ITERATIONS;
    }


    public int getCHANCE_TO_REPRODUCE() {
        return CHANCE_TO_REPRODUCE;
    }

    public void setCHANCE_TO_REPRODUCE(int CHANCE_TO_REPRODUCE) {
        this.CHANCE_TO_REPRODUCE = CHANCE_TO_REPRODUCE;
    }

    public int getDECLINE_IN_HEALTH() {
        return DECLINE_IN_HEALTH;
    }

    public void setDECLINE_IN_HEALTH(int DECLINE_IN_HEALTH) {
        this.DECLINE_IN_HEALTH = DECLINE_IN_HEALTH;
    }

    public int getWidthMap() {
        return widthMap;
    }

    public void setWidthMap(int widthMap) {
        this.widthMap = widthMap;
    }

    public int getHeightMap() {
        return heightMap;
    }

    public void setHeightMap(int heightMap) {
        this.heightMap = heightMap;
    }

    public int getNUMBER_ANIMAL_AT_CREATION() {
        return NUMBER_ANIMAL_AT_CREATION;
    }

    public void setNUMBER_ANIMAL_AT_CREATION(int NUMBER_ANIMAL_AT_CREATION) {
        this.NUMBER_ANIMAL_AT_CREATION = NUMBER_ANIMAL_AT_CREATION;
    }

    public Map<String, Map<String, Integer>> getPercentOfEating() {
        Map<String, Map<String, Integer>> percentOfEating = new HashMap<>();
        try {
            ObjectMapper mapper = new YAMLMapper();
            EatingMap prop = mapper.readValue(new FileReader("settings/settings-eating-table.yaml"), EatingMap.class);
            percentOfEating = prop.getPercentOfEating();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return percentOfEating;
    }
}
