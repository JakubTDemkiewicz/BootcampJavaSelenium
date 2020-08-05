package com.company.Webinar7;

public class Teacher extends Person {
    private String academicDegree;
    private String specialization;
    private double salary;

    public double getSalary(){
        return this.salary;
    }

    public Teacher(String name, String surname, int age, String specialization, String academicDegree, double salary) {
        super(name, surname, age);
        this.specialization = specialization;
        this.academicDegree = academicDegree;
        this.salary = salary;
    }

    @Override
    public void displayInformationAboutPerson(){
        super.displayInformationAboutPerson();
        System.out.printf("My Academic Degree is %s and specialization is %s. ", this.academicDegree, this.specialization);
    }

    public double calculateAnnualBonus(){
        return this.salary * 12 * 0.1;
    }

}
