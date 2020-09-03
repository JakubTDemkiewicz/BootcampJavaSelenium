package com.company.Webinar10.Teachers;

import com.company.Webinar10.Person;

public class Teacher extends Person implements ExamConducter {
    private String specialization;

    public Teacher(String name, String surname, int age, String specialization) {
        super(name, surname, age);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return this.specialization;
    }

    public String getFullName() {
        return getName() + " " + getSurname();
    }

    @Override
    public void reasonForGoingToUniversity() {
        System.out.println("I will learn. ");
    }

    @Override
    public void wayOfSpendingHolidays() {
        System.out.println("With Family");
    }

    @Override
    public void scientificPapersWriting() {
        System.out.println("Someone is writing for me...  ");
    }

    @Override
    public void wayOfExamination() {
        System.out.println("All exams are online! ");
    }

    @Override
    public void howHeWorks() {
        System.out.println("Others works for me");
    }
}
