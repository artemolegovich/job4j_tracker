package ru.job4j.inheritance;

public class Builder extends Engineer {
    private String construction;

    public Builder(String name, String surname, String education,
                      String birthday, String designing, String construction) {
        super(name, surname, education, birthday, designing);
        this.construction = construction;
    }

    public String work() {
        return construction;
    }
}
