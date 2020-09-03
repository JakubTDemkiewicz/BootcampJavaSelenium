package com.company.Webinar10.Students;

import com.company.Webinar10.Exceptions.IncorrectStudentAge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentCreator {
    private final static int MAX_STUDENT_AGE = 30;
    private static final String FILE_PATH = "src/com/company/Webinar10/Data/students.txt";

    public static Student createStudentFromConsole() throws IncorrectStudentAge {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type student name: ");
        String name = scanner.next();
        System.out.println("Type student surname: ");
        String surname = scanner.next();
        System.out.println("Type student age: ");
        int age = validateStudentAge(Integer.parseInt(scanner.next()));
        System.out.println("Type learning method: ");
        String learningMethod = scanner.next();
        System.out.println("Type field of study: ");
        String fieldOfStudy = scanner.next();
        System.out.println("Type information about vacation: ");
        String vacation = scanner.next();
        System.out.println("Free time: beer/vodka...: ");
        String freeTime = scanner.next();
        System.out.println("Type semester: ");
        int semester = Integer.parseInt(scanner.next());
        return new Student(name, surname, age, learningMethod, fieldOfStudy, vacation, freeTime, semester);
    }

    public static Set<Student> createStudentsFromFile() {
        Set<Student> students = new HashSet<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] row = line.split(",");
                try {
                    students.add(new Student(row[0], row[1], validateStudentAge(Integer.parseInt(row[2])), row[3],
                            row[4], row[5], row[6], Integer.parseInt(row[7])));
                } catch (IncorrectStudentAge e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (IOException err) {
            err.printStackTrace();
        }
        return students;
    }

    private static int validateStudentAge(int age) throws IncorrectStudentAge {
        if (age > MAX_STUDENT_AGE) {
            throw new IncorrectStudentAge("Student age can't be higher than 30");
        } else
            return age;
    }
}
