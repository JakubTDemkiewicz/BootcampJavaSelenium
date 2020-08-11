package com.company.Webinar9.teachers;

import com.company.Webinar9.Subjects;

import java.util.ArrayList;
import java.util.List;

public class GenerateTeachers implements Subjects {
    private List<Teacher> teachers = new ArrayList<>();

    public List<Teacher> getTeachers() {
        teachers.add(new Teacher("Józek", "Jakiś", 34, getSubjectsForBioInformaticStudies().get(0), "Doctor",
                14414, "Playing games"));
        teachers.add(new Teacher("Bożena", "Awer", 56, getSubjectsForBioInformaticStudies().get(1), "mgr",
                5453, "Playing scrabble"));
        teachers.add(new Teacher("Flippo", "Flappo", 45, getSubjectsForBioInformaticStudies().get(2), "Doctor",
                14414, "Swimming"));
        teachers.add(new Teacher("Mariusz", "Dziwny", 45, getSubjectsForBioInformaticStudies().get(3), "Doctor",
                14414, "Swimming"));
        teachers.add(new Teacher("Rozalia", "Konopko", 45, getSubjectsForBioInformaticStudies().get(4), "Doctor",
                14414, "Swimming"));
        setResearchSubject();
        return teachers;
    }
    private void setResearchSubject(){
        teachers.forEach(teacher -> teacher.research("RESEARCH NOTHING"));
    }
}
