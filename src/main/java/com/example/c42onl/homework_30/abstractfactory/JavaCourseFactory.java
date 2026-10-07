package com.dz33.c42onl.homework_30.abstractfactory;

public class JavaCourseFactory implements CourseFactory{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Language createLanguage() {
        return new JavaLanguage();
    }

    @Override
    public LessonProgram createLessonProgram() {
        return new JavaLessonProgram();
    }
}
