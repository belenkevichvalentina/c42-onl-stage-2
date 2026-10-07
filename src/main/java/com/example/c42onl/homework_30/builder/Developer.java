package com.dz33.c42onl.homework_30.builder;

import lombok.Builder;

import java.util.Locale;

public class Developer {
    private String name;
    private String language;
    private int experienceYears;
    private boolean isSenior;

    private Developer(Builder builder) {
        this.name = builder.name;
        this.language = builder.language;
        this.experienceYears = builder.experienceYears;
        this.isSenior = builder.isSenior;
    }
    @Override
    public String toString(){
        return "Developer{name='" + name + "', language='" + language +
                "', experience=" + experienceYears + ", isSenior=" + isSenior + "}";
    }


    public static class Builder{
        private String name;
        private String language;
        private int experienceYears;
        private boolean isSenior;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setLanguage(String language) {
            this.language = language;
            return this;
        }

        public Builder setExperienceYears(int experienceYears) {
            this.experienceYears = experienceYears;
            return this;
        }

        public Builder setSenior(boolean senior) {
            isSenior = senior;
            return this;
        }
        public Developer build(){
            return new Developer(this);
        }

    }


}
