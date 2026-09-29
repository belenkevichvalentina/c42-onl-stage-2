package com.example.c42onl.homework_30.factorymethod;

public class DeveloperFactory {
    public Developer createDeveloper(String language){
        if (language.equalsIgnoreCase("java")){
            return new JavaDeveloper();
        }else if (language.equalsIgnoreCase("python")){
            return new PythonDeveloper();
        }
        throw new IllegalArgumentException("Неизвестный язык: "  + language);
    }
}
