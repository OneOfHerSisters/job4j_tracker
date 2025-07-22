package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Anna Kosakowska");
        student.setGroup(1);
        student.setEnrollmentDate(new Date());
        System.out.println("name: " + student.getName() + System.lineSeparator()
        + "group: " + student.getGroup() + System.lineSeparator()
        + "enrollmentDate: " + student.getEnrollmentDate());
    }
}
