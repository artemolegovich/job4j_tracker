package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String programming;

    public Programmer(String name, String surname, String education,
                      String birthday, String designing, String programming) {
        super(name, surname, education, birthday, designing);
        this.programming = programming;
    }

    public String work() {
        return programming;
    }
}
