package com.company.Webinar9.teachers;

import com.company.Webinar9.Person;
import com.company.Webinar9.Subjects;
import com.company.Webinar9.students.Student;

import java.util.*;

public class Teacher extends Person implements ExamsAndResearch, Subjects {
    private final String academicDegree;
    private final String specialization;
    private final String vacationInformation;
    private final double salary;
    private Set<Student> examStudentList = new HashSet<>();
    private String researchSubject;

    public Teacher(String name, String surname, int age, String specialization, String academicDegree,
                   double salary, String vacationInformation) {
        super(name, surname, age);
        this.specialization = specialization;
        this.academicDegree = academicDegree;
        this.salary = salary;
        this.vacationInformation = vacationInformation;
    }

    public String getSpecialization() {
        return specialization;
    }

    public Set<Student> getExamStudentList() {
        return this.examStudentList;
    }

    @Override
    protected void reasonToVisitCollege() {
        System.out.println("\nIn the college I will teach. ");
    }

    @Override
    protected void informationAboutVacations() {
        System.out.printf("On Vacation I will %s", this.vacationInformation);
    }

    @Override
    protected void displayInformationAboutPerson() {
        super.displayInformationAboutPerson();
        System.out.printf("My Academic Degree is %s and specialization is %s. I earn %.2f a month. As annual bonus I get " +
                        "%.2f"
                , this.academicDegree, this.specialization, this.salary, calculateAnnualBonus());
        System.out.print(" Research Topic: " + this.researchSubject);
    }

    public double calculateAnnualBonus() {
        return this.salary * 12 * 0.1;
    }

    @Override
    public void makeExamForStudents(List<Student> student) {
        Set<Student> notPassedStudents = new LinkedHashSet<>();
        student.forEach(s -> {
            if (!s.isExamPassed(this.specialization)) {
                notPassedStudents.add(s);
            }
        });
        this.examStudentList = notPassedStudents;
    }

    @Override
    public void research(String researchSubject) {
        this.researchSubject = researchSubject;
    }
}
