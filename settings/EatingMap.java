package settings;

import java.util.Map;

public class EatingMap {
    private Map<String, Map<String, Integer>> percentOfEating;

    public Map<String, Map<String, Integer>> getPercentOfEating() { return percentOfEating; }
    public void setPercentOfEating(Map<String, Map<String, Integer>> percentOfEating) { this.percentOfEating = percentOfEating; }
}