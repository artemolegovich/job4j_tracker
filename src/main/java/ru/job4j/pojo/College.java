package ru.job4j.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Petrov Sergey Ivanovich");
        student.setGroup(4);
        student.setAdmission(new Date());
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(student.getFio()
                + " was admissed in group " + "\"" + student.getGroup() + "\""
                + " " + dateFormat.format(student.getAdmission()));
    }
}
