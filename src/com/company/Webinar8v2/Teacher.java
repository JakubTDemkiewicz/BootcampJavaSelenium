package com.company.Webinar8v2;

public class Teacher extends Person {
    private final String academicDegree;
    private final String specialization;
    private final String vacationInformation;
    private final double salary;

    public Teacher(String name, String surname, int age, String specialization, String academicDegree,
                   double salary, String vacationInformation) {
        super(name, surname, age);
        this.specialization = specialization;
        this.academicDegree = academicDegree;
        this.salary = salary;
        this.vacationInformation = vacationInformation;
    }

    @Override
    void reasonToVisitCollege() {
        System.out.println("\nIn the college I will teach. ");
    }

    @Override
    void informationAboutVacations() {
        System.out.printf("On Vacation I will %s", this.vacationInformation);
    }

    @Override
    protected void displayInformationAboutPerson() {
        super.displayInformationAboutPerson();
        System.out.printf("My Academic Degree is %s and specialization is %s. I earn %.2f a month. As annual bonus I get " +
                        "%.2f"
                , this.academicDegree, this.specialization, this.salary, calculateAnnualBonus());
    }

    public double calculateAnnualBonus() {
        return this.salary * 12 * 0.1;
    }

}
