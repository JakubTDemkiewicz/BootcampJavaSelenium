package com.company.Webinar9;

import java.util.ArrayList;
import java.util.List;

public interface Subjects {
    default List<String> getSubjectsForBioInformaticStudies(){
        List<String> subjects = new ArrayList<>();
        subjects.add("Bioinformatic");
        subjects.add("W-F");
        subjects.add("Chemistry");
        subjects.add("Biology");
        subjects.add("English");
        return subjects;
    }
}
