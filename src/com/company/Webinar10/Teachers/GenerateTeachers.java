package com.company.Webinar10.Teachers;

import java.util.ArrayList;
import java.util.List;

public class GenerateTeachers {
    private List<Teacher> teachers = new ArrayList<>();

    public List<Teacher> getTeachers() {
        teachers.add(new Teacher("Józek", "Jakiś", 34, "W-F"));
        teachers.add(new Teacher("Bożena", "Awer", 56, "Spain"));
        teachers.add(new Teacher("Flippo", "Flappo", 35, "English"));
        teachers.add(new Teacher("Mariusz", "Dziwny", 65, "Mathematic"));
        teachers.add(new Teacher("Rozalia", "Konopko", 30, "History"));
        return teachers;
    }
}
