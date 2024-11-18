package Miscellaneous;

public class User {
    private String name;
    private boolean restricted;

    public User(String name, boolean restricted) {
        this.name = name;
        this.restricted = restricted;
    }

    public String getName() {
        return name;
    }

    public boolean isRestricted() {
        return restricted;
    }
}