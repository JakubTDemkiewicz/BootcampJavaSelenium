package com.company.Webinar8v2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Person> people = new ArrayList<>();
    public static void main(String[] args) {
        generateData();
        for (Person person : people)
            displayInformation(person);
    }

    private static void displayInformation(Person person) {
        person.displayAllInformationAboutPerson();
        System.out.println();
    }

    private static void generateData() {
        Teacher filip = new Teacher("Filip", "Konopko", 35, "Chemistry",
                "Doctor", 3522.14, "Travel");

        createStudent("Flip", "Flap", 29, "Teleinformatic",
                5, "Drinking");

        Teacher magda = new Teacher("Magda", "Magdalena", 25, "Biology",
                "Doctor", 567.34, "Play games");

        createStudent("Flap", "Flip", 35, "Something", 4, "Travel");

        Teacher justyna = new Teacher("Justyna", "Justa", 45, "History",
                "Doctor", 5546.77, "Play music");

        createStudent("Janusz", "Januszewski", 19, "Biology",
                3, "play computer games");

        createStudent("Anna", "Anna", 39, "History",
                2, "swim to usa");

        createStudent("Bolek", "Cienki", 23, "Math",
                1, "visit Wuhan");

        createStudent("Lolek", "Cienki", 49, "Everything",
                6, "go to Paris");

        createStudent("Grażyna", "Kowalska", 25, "Drinking",
                7, "sing a song");

        people.add(filip);
        people.add(magda);
        people.add(justyna);
    }

    private static void createStudent(String name, String surname, int age, String fieldOfStudy, int semester,
                                      String vacationInformation){
        try {
            Student flap = new Student(name, surname, age, fieldOfStudy, semester, vacationInformation);
            people.add(flap);
        }catch (IllegalArgumentException e){
            System.out.println(e.toString());
        }
    }
}

