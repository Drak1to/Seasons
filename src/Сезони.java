public enum Сезони  {
    ЗИМА("WINTER"),
    ВЕСНА("SPRING"),
    ЛІТО("SUMMER"),
    ОСІНЬ("AUTUMN");

    private final String engVersion;

    Сезони(String engVersion) {
        this.engVersion = engVersion;
    }

    public String getEngVersion() {
        return engVersion;
    }
}

