package com.company.Webinar8;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people = generateData();

        for (Person person : people)
            displayInformation(person);
    }

    private static void displayInformation(Person person) {
        person.displayAllInformationAboutPerson();
        System.out.println();
    }

    private static List<Person> generateData() {
        List<Person> people = new ArrayList<>();
        Teacher filip = new Teacher("Filip", "Konopko", 35, "Chemistry",
                "Doctor", 3522.14, "Travel");

        Student flip = new Student("Flip", "Flap", 29, "Teleinformatic",
                5, "Drinking");

        Teacher magda = new Teacher("Magda", "Magdalena", 25, "Biology",
                "Doctor", 567.34, "Play games");

        Student flap = new Student("Flap", "Flip", 35, "Something",
                4, "Travel");

        Teacher justyna = new Teacher("Justyna", "Justa", 45, "History",
                "Doctor", 5546.77, "Play music");

        Student janusz = new Student("Janusz", "Januszewski", 19, "Biology",
                3, "play computer games");

        Student anna = new Student("Anna", "Anna", 56, "History",
                2, "swim to usa");

        Student bolek = new Student("Bolek", "Cienki", 23, "Math",
                1, "visit Wuhan");

        Student lolek = new Student("Lolek", "Cienki", 28, "Everything",
                6, "go to Paris");

        Student grazyna = new Student("Grażyna", "Kowalska", 25, "Drinking",
                7, "sing a song");

        people.add(filip);
        people.add(flip);
        people.add(magda);
        people.add(flap);
        people.add(justyna);
        people.add(janusz);
        people.add(anna);
        people.add(bolek);
        people.add(lolek);
        people.add(grazyna);

        return people;
    }
}

