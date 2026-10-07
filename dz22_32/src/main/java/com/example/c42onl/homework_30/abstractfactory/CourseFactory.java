package com.example.c42onl.homework_30.abstractfactory;

public interface CourseFactory {
    Developer createDeveloper();
    Language createLanguage();
    LessonProgram createLessonProgram();
}
