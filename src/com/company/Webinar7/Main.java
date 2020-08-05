package com.company.Webinar7;

public class Main {
    public static void main(String []args){
        Teacher filip = new Teacher("Filip", "Konopko", 35, "Chemistry",
                "Doctor", 3522.14);

        Student flip = new Student("Flip", "Flap", 29, "Teleinformatic",
                5);

        Person randomPerson = new Person("Person", "NN", 40);
        randomPerson.displayInformationAboutPerson();

        filip.displayInformationAboutPerson();
        System.out.println("My salary is: " + filip.getSalary());
        System.out.println("Annual bonus: " + filip.calculateAnnualBonus());
        System.out.printf("My salary with bonus is: %.2f\n", (filip.getSalary() + filip.calculateAnnualBonus()));

        flip.displayInformationAboutPerson();
    }
}
