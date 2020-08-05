package com.company.Webinar7;

public class Student extends Person {
    private String fieldOfStudy;
    private int semester;


    public Student(String name, String surname, int age, String fieldOfStudy, int semester) {
        super(name, surname, age);
        this.fieldOfStudy = fieldOfStudy;
        this.semester = semester;
    }

    @Override
    public void displayInformationAboutPerson(){
        super.displayInformationAboutPerson();
        System.out.printf("I study %s and I am on %d semester. ", this.fieldOfStudy, this.semester);
    }
}
