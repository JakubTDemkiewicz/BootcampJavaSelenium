package com.company.Webinar10.Exams;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Index {
    private Map<String, Integer> index = new HashMap<String, Integer>() {{
        put("history", 0);
        put("w-f", 0);
        put("english", 0);
        put("mathematic", 0);
        put("spain", 0);
    }};

    public Index() {
        this.index = setGradesInIndex(this.index);
    }

    public Map<String, Integer> getIndex() {
        return index;
    }

    public void putGradeInIndex(String subject, int grade) {
        this.index.put(subject, grade);
    }

    private Map<String, Integer> setGradesInIndex(Map<String, Integer> index) {
        index.replaceAll((k, v) -> v = new Random().nextInt(6));
        return index;
    }
}
