package com.company.Webinar8v2;

public class Student extends Person {
    private final static int MAX_STUDENT_AGE = 30;
    private final String fieldOfStudy;
    private final int semester;
    private final String vacationInformation;

    public Student(String name, String surname, int age, String fieldOfStudy, int semester, String vacationInformation) {
        super(name, surname, validateStudentAge(age));
        this.fieldOfStudy = fieldOfStudy;
        this.semester = semester;
        this.vacationInformation = vacationInformation;
    }

    private static int validateStudentAge(int age) {
        if (age > MAX_STUDENT_AGE) {
            throw new IllegalArgumentException("Student age can't be higher than 30");
        } else
            return age;
    }

    @Override
    void reasonToVisitCollege() {
        System.out.println("In the college I am going to learn!");
    }

    @Override
    void informationAboutVacations() {
        System.out.printf("On vacation I will %s", this.vacationInformation);
    }

    @Override
    protected void displayInformationAboutPerson() {
        super.displayInformationAboutPerson();
        System.out.printf("I study %s and I am on %d year on the %d semester. ", this.fieldOfStudy,
                this.calculateYear(), this.semester);
    }

    private int calculateYear() {
        return (int) Math.ceil((double) semester / 2);
    }
}
