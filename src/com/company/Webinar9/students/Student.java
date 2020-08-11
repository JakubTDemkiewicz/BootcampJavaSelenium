package com.company.Webinar9.students;

import com.company.Webinar9.Person;
import com.company.Webinar9.Subjects;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Student extends Person implements LearningMethodsAndExams, FreeTime, Subjects {
    private final static int MAX_STUDENT_AGE = 30;
    private static int numberOfIndex = 1;
    private final int indexNumber;
    private String fieldOfStudy;
    private int semester;
    private String vacationInformation;
    private LearningMethodsAndExams.learningMethod learningMethod;
    private Map<String, Integer> index = new HashMap<>();

    public Student(String name, String surname, int age, String fieldOfStudy, int semester, String vacationInformation) {
        super(name, surname, validateStudentAge(age));
        this.fieldOfStudy = fieldOfStudy;
        this.semester = semester;
        this.vacationInformation = vacationInformation;
        this.indexNumber = numberOfIndex++;
        createIndex(fieldOfStudy);
    }

    private static int validateStudentAge(int age) {
        if (age > MAX_STUDENT_AGE) {
            throw new ArithmeticException("Student age can't be higher than 30");
        } else
            return age;
    }

    private void createIndex(String fieldOfStudy) {
        if (fieldOfStudy.equals("BioInformatic"))
            this.index = getSubjectsForBioInformaticStudies().stream().collect(Collectors.toMap(subject -> subject, v -> 0));
    }

    public Map<String, Integer> getIndex() {
        return index;
    }

    public void setIndex(Map<String, Integer> index) {
        this.index = index;
    }

    public int getIndexNumber() {
        return this.indexNumber;
    }

    @Override
    public void reasonToVisitCollege() {
        System.out.printf("In the college I am going to learn from %s! ", this.learningMethod);
    }

    @Override
    public void informationAboutVacations() {
        System.out.printf("On vacation I will %s", this.vacationInformation);
    }

    @Override
    protected void displayInformationAboutPerson() {
        super.displayInformationAboutPerson();
        System.out.printf("I study %s and I am on %d year on the %d semester. ", this.fieldOfStudy,
                this.calculateYear(), this.semester);
        drinkWithFriends();
    }

    private int calculateYear() {
        return (int) Math.ceil((double) semester / 2);
    }

    @Override
    public void setLearningMethods(learningMethod learningMethod) {
        this.learningMethod = learningMethod;
    }

    @Override
    public boolean isExamPassed(String examName) {
        return this.index.get(examName) > 2;
    }

    @Override
    public void drinkWithFriends() {
        System.out.println("I will drink beers with friends ");
    }

    public String displayInformationAboutGrade(String subject){
        return "\tIndex number: " + this.getIndexNumber()+ " " + getName() + " " + getSurname() +
                ", Grade: " + this.index.get(subject);
    }
}
