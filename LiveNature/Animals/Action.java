package LiveNature.Animals;

public enum Action {
    MOVE(90),
    EAT(100),
    REPRODUCE(50),
    SLEEP(100),
    ;

    Action(int actionChance) {
    }
}
