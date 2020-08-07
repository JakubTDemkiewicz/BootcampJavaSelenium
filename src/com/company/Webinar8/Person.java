package com.company.Webinar8;

abstract class Person {
    private final String name;
    private final String surname;
    private final int age;

    protected Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    abstract void reasonToVisitCollege();

    abstract void informationAboutVacations();

    protected void displayInformationAboutPerson() {
        System.out.printf("\nHey! My name is %s %s and I am %d old. ", this.name, this.surname, this.age);
    }
    public void displayAllInformationAboutPerson(){
        displayInformationAboutPerson();
        reasonToVisitCollege();
        informationAboutVacations();
    }
}
