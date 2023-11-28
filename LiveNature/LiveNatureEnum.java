package LiveNature;

public enum LiveNatureEnum {
    WOLF("🐺"),
    BOA("🐍"),
    FOX("🦊"),
    BEAR("🐻"),
    EAGLE("🦅"),
    HORSE("🐎"),
    DEER( "🦌"),
    RABBIT("🐇"),
    MOUSE("🐁"),
    GOAT("🐐"),
    SHEEP("🐑"),
    BOAR("🐗"),
    BUFFALO("🐃"),
    DUCK("🦆"),
    CATERPILLAR("🐛"),
    GRASS("🌱"),
    OATS("🌾");
    private final String unicodeSymbol;
    LiveNatureEnum(String unicodeSymbol) {
      this.unicodeSymbol = unicodeSymbol;
    }

    public String getUnicodeSymbol() {
        return unicodeSymbol;
    }
}
