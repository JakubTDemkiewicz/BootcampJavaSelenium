package com.company.Webinar9;

public abstract class Person {
    private final String name;
    private final String surname;
    private final int age;

    protected Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    protected abstract void reasonToVisitCollege();

    protected abstract void informationAboutVacations();

    protected void displayInformationAboutPerson() {
        System.out.printf("\nHey! My name is %s %s and I am %d old. ", this.name, this.surname, this.age);
    }

    public void displayAllInformationAboutPerson() {
        displayInformationAboutPerson();
        reasonToVisitCollege();
        informationAboutVacations();
    }
}
