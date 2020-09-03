package com.company.Webinar10.Students;

import com.company.Webinar10.Exams.Index;
import com.company.Webinar10.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Student extends Person implements BeerDrinker, ExamTaker {
    private static int numberOfIndex = 1;
    private final int indexNumber;
    private int semester;
    private String learningMethod;
    private String vacationInformation;
    private String fieldOfStudy;
    private String freeTime;
    private Index index;

    public Student(String name, String surname, int age, String learningMethod
            , String fieldOfStudy, String vacationInformation, String freeTime, int semester) {
        super(name, surname, age);
        this.semester = semester;
        this.learningMethod = learningMethod;
        this.fieldOfStudy = fieldOfStudy;
        this.vacationInformation = vacationInformation;
        this.indexNumber = numberOfIndex++;
        this.index = new Index();
        this.freeTime = freeTime;
    }

    public Map<String, Integer> getIndex() {
        return this.index.getIndex();
    }

    public void putGradeInIndex(String subject, int grade) {
        this.index.putGradeInIndex(subject, grade);
    }

    public int getIndexNumber() {
        return this.indexNumber;
    }

    @Override
    public void reasonForGoingToUniversity() {
        System.out.println("In the college I will study and I am going to learn");
    }

    @Override
    public void wayOfSpendingHolidays() {
        System.out.printf("On vacation I will %s", this.vacationInformation);
    }

    @Override
    public void introducePerson() {
        super.introducePerson();
        System.out.printf("I study %s and I am on %d year on the %d semester.\n", this.fieldOfStudy,
                this.calculateYear(), this.semester);
    }

    private int calculateYear() {
        return (int) Math.ceil((double) semester / 2);
    }

    @Override
    public void howToSpendFreeTime() {
        System.out.printf("\nIn free time I %s", this.freeTime);
    }

    @Override
    public void learningMethod() {
        System.out.printf("I'm gonna learn from %s", this.learningMethod);
    }

    @Override
    public void averageGrade() {
        List<Integer> values = new ArrayList<>(index.getIndex().values());
        double averageGrade = 0;
        for (int val : values) {
            averageGrade += val;
        }
        System.out.println("Average Grade: " + averageGrade / values.size());
    }
}
