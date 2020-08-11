package com.company.Webinar9.students;

interface LearningMethodsAndExams {
    enum  learningMethod{
        Internet, Books
    }
    void setLearningMethods(LearningMethodsAndExams.learningMethod method);
    boolean isExamPassed(String examName);
}
