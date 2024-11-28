package org.colleg.practice2.task4;

public class HospitalDirector {
    private PersonBuilder builder;

    public void setBuilder(PersonBuilder builder) {
        this.builder = builder;
    }

    public PersonBuilder construct() {
        return builder.build();
    }
}
