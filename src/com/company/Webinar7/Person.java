package com.company.Webinar7;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person (String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void displayInformationAboutPerson(){
        System.out.printf("\nHey! My name is %s %s and I am %d old. ", this.name, this.surname, this.age);
    }
}
