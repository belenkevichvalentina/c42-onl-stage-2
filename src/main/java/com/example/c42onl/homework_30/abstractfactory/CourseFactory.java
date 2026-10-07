package com.dz33.c42onl.homework_30.abstractfactory;

public interface CourseFactory {
    Developer createDeveloper();
    Language createLanguage();
    LessonProgram createLessonProgram();
}
