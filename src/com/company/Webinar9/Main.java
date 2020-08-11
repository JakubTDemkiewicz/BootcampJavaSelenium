package com.company.Webinar9;

import com.company.Webinar9.students.GenerateStudents;
import com.company.Webinar9.students.Student;
import com.company.Webinar9.teachers.GenerateTeachers;
import com.company.Webinar9.teachers.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        List<Student> students = new GenerateStudents().getStudents();
        List<Teacher> teachers = new GenerateTeachers().getTeachers();
        people.addAll(students);
        people.addAll(teachers);

        people.forEach(Main::displayInformation);
        System.out.println("\n");
        teachers.forEach(teacher -> teacher.makeExamForStudents(students));
        teachers.forEach(Main::displayExamsList);
    }

    private static void displayInformation(Person person) {
        person.displayAllInformationAboutPerson();
        System.out.println();
    }

    private static void displayExamsList(Teacher teacher){
        if (!teacher.getExamStudentList().isEmpty()){
            System.out.println(teacher.getSpecialization() + " exam list: ");
            for (Student student : teacher.getExamStudentList()) {
                System.out.println(student.displayInformationAboutGrade(teacher.getSpecialization()));
            }
            System.out.println();
        }else {
            System.out.printf("All students passed %s exam\n\n", teacher.getSpecialization());
        }
    }
}

