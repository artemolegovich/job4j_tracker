package ru.job4j.inheritance;

public class Engineer extends Profession {
    private String designing;

    public Engineer(String name, String surname, String education,
                    String birthday, String designing) {
        super(name, surname, education, birthday);
        this.designing = designing;
    }

    public String getDesigning() {
        return designing;
    }
}
