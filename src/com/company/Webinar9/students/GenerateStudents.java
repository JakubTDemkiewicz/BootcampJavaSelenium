package com.company.Webinar9.students;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class GenerateStudents {
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents(){
        createStudent("Flip", "Flap", 29, "BioInformatic",
                5, "Drinking");

        createStudent("Flap", "Flip", 35, "BioInformatic", 4, "Travel");

        createStudent("Janusz", "Januszewski", 19, "BioInformatic",
                3, "play computer games");

        createStudent("Anna", "Anna", 39, "BioInformatic",
                2, "swim to usa");

        createStudent("Bolek", "Cienki", 23, "BioInformatic",
                1, "visit Wuhan");

        createStudent("Lolek", "Cienki", 49, "BioInformatic",
                6, "go to Paris");

        createStudent("Grażyna", "Kowalska", 25, "BioInformatic",
                7, "sing a song");
        setLearningMethod();
        return this.students;
    }

    private void setLearningMethod(){
        students.forEach(student -> student.setLearningMethods(LearningMethodsAndExams.LearningMethods.values()[(int) (Math.random() * LearningMethodsAndExams.LearningMethods.values().length)]));
    }

    private void createStudent(String name, String surname, int age, String fieldOfStudy, int semester,
                                      String vacationInformation){
        try {
            Student student = new Student(name, surname, age, fieldOfStudy, semester, vacationInformation);
            student.setIndex(setGradesInIndex(student.getIndex()));
            this.students.add(student);
        }catch (ArithmeticException e){
            System.out.println(e.toString());
        }
    }

    private Map<String, Integer> setGradesInIndex(Map<String, Integer> index){
        index.replaceAll((k, v) -> v = new Random().nextInt(5)+1);
        return index;
    }
}
