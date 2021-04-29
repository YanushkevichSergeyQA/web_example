package enums;

public enum ShowName {
    TLK("The Lion King");

    private final String name;

    ShowName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
