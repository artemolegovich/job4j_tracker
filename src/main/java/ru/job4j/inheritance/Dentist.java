package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private int cabinet;

    public Dentist(String name, String surname, String education, String birthday,
                   String specialization, int cabinet) {
        super(name, surname, education, birthday, specialization);
        this.cabinet = cabinet;
    }

    public void dentalTreatment() {
    }
}
