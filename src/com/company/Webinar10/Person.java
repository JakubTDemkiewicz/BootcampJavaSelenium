package com.company.Webinar10;

import java.util.Objects;

public abstract class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
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

    protected void introducePerson() {
        System.out.printf("My name is %s %s, I am %d years old", this.name, this.surname, this.age);
    }

    public abstract void reasonForGoingToUniversity();

    public abstract void wayOfSpendingHolidays();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                name.equals(person.name) &&
                surname.equals(person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }
}
