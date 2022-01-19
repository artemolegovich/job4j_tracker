package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String qualification;

    public Surgeon(String name, String surname, String education, String birthday,
                   String specialization, String qualification) {
        super(name, surname, education, birthday, specialization);
        this.qualification = qualification;
    }

    public void operation() {
    }
}
