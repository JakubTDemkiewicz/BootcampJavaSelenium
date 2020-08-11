package com.company.Webinar9.teachers;

import com.company.Webinar9.students.Student;

import java.util.List;

interface ExamsAndResearch {
    void makeExamForStudents(List<Student> student);
    void research(String researchSubject);
}
