package com.dz33.c42onl.homework_30.abstractfactory;

public class PythonCourseFactory implements CourseFactory{
    @Override
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }

    @Override
    public Language createLanguage() {
        return new PythonLanguage();
    }

    @Override
    public LessonProgram createLessonProgram() {
        return new PythonLessonProgram();
    }
}
