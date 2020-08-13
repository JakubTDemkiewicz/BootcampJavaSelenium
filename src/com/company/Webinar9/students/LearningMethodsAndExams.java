package com.company.Webinar9.students;

interface LearningMethodsAndExams {
    enum LearningMethods {
        Internet, Books
    }
    void setLearningMethods(LearningMethods method);
    boolean isExamPassed(String examName);
}
