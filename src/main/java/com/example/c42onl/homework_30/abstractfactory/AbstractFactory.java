package com.dz33.c42onl.homework_30.abstractfactory;

public class AbstractFactory {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Developer developer = courseFactory.createDeveloper();
        Language language = courseFactory.createLanguage();
        LessonProgram lessonProgram = courseFactory.createLessonProgram();

        developer.writeCode();
        System.out.println(language.getName());
        lessonProgram.showProgram();
    }
}
