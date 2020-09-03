package com.company.Webinar10.Exams;

import com.company.Webinar10.Students.Student;
import com.company.Webinar10.Teachers.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam {
    private String subject;
    private String professorFullName;
    private List<Student> examList;

    public Exam(String subject, String professorFullName) {
        this.subject = subject.toLowerCase();
        this.professorFullName = professorFullName;
        this.examList = new ArrayList<>();
    }

    public void createExamList(List<Student> students) {
        if (!students.isEmpty()) {
            for (Student s : students) {
                if (s.getIndex().get(this.subject.toLowerCase()) == 0) {
                    this.examList.add(s);
                }
            }
        }
    }

    public void makeExam(Object object) {
        if (object instanceof Teacher) {
            if (!this.examList.isEmpty()) {
                System.out.println("\n" + this.subject + " " + this.professorFullName + " Exam is starting... ");
                System.out.println("List of students attending to exam: ");
                for (Student student : this.examList) {
                    System.out.println("Index: " + student.getIndexNumber() + "  " + student.getName() + " " + student.getSurname());
                }
                System.out.println("\nExam is ended. Time to put grades into Index: ");
                putGrades();
            }
        } else {
            System.out.println("Only teachers can make exam!");
        }
    }

    public void putGrades() {
        Scanner scanner = new Scanner(System.in);
        for (Student student : this.examList) {
            System.out.println("\nIndex: " + student.getIndexNumber());
            System.out.println("Provide grade: ");
            student.putGradeInIndex(this.subject, Integer.parseInt(scanner.next()));
            System.out.println("Updated Student index: " + student.getIndex().toString());
        }
    }
}
