package com.company;

import com.company.Webinar10.Exams.Exam;
import com.company.Webinar10.Exceptions.IncorrectStudentAge;
import com.company.Webinar10.Students.Student;
import com.company.Webinar10.Students.StudentCreator;
import com.company.Webinar10.Teachers.GenerateTeachers;
import com.company.Webinar10.Teachers.Teacher;

import java.util.*;


public class Main {
    static Set<Student> students = new HashSet<>();
    static List<Teacher> teachers = new GenerateTeachers().getTeachers();

    public static void main(String[] args) {
        int selectedOption;
        do {
            displayMenu();
            selectedOption = handleMenuOptions();
        } while ((selectedOption != 0));
    }

    public static void displayMenu() {
        System.out.println("\n\t\t\tMenu");
        System.out.println("1. Create student from console");
        System.out.println("2. Fetch students from file");
        System.out.println("3. Display all Students: ");
        System.out.println("4. Display student information by index number: ");
        System.out.println("5. Make exam: ");
        System.out.println("5. Make exam as Student: ");
        System.out.println("0. Close program");
        System.out.println("What you want to do? : ");
    }

    public static int handleMenuOptions() {
        switch (readResponseFromUser()) {
            case 1:
                try {
                    students.add(StudentCreator.createStudentFromConsole());
                } catch (IncorrectStudentAge err) {
                    System.out.println(err.getMessage());
                }
                break;
            case 2:
                students.addAll(StudentCreator.createStudentsFromFile());
                break;
            case 3:
                displayStudents();
                break;
            case 4:
                displayStudentByIndex();
                break;
            case 5:
                for (Teacher teacher : teachers) {
                    makeExam(teacher);
                }
                break;
            case 6:
                makeExamAsStudent();
                break;
            case 0:
                System.out.println("Bye bye");
                return 0;
            default:
                System.out.println("You provided wrong value");
        }
        return Integer.MIN_VALUE;
    }

    public static int readResponseFromUser() {
        Scanner scanner = new Scanner(System.in);
        try {
            return Math.abs(Integer.parseInt(scanner.nextLine()));
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static void displayStudents() {
        for (Student student : students) {
            System.out.printf("Index number: %d\t. ", student.getIndexNumber());
            student.introducePerson();
        }
    }

    public static void displayStudentByIndex() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type student index number: ");
        Student s = findStudent(students, Integer.parseInt(scanner.next()));
        if (s != null) {
            s.introducePerson();
            s.averageGrade();
            System.out.println(s.getIndex().toString());
        } else {
            System.out.println("There is no student with this index.");
        }
    }

    private static Student findStudent(Collection<Student> students, int indexNumber) {
        return students.stream().filter(student -> indexNumber == student.getIndexNumber())
                .findFirst().orElse(null);
    }

    public static void makeExam(Teacher teacher) {
        if (!students.isEmpty()) {
            Exam exam = new Exam(teacher.getSpecialization(), teacher.getFullName());
            exam.createExamList(new ArrayList<>(students));
            exam.makeExam(teacher);
        } else
            System.out.println("Student List is empty !\n");
    }

    public static void makeExamAsStudent() {
        Exam exam = new Exam("W-F", "asdad");
        exam.makeExam(new Student("asd", "asd", 4, "3", "3", "4", "5", 4));
    }
}
