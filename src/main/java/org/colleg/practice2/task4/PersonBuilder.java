package org.colleg.practice2.task4;

public abstract class PersonBuilder {
    protected int id;
    protected String name;

    public PersonBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public abstract PersonBuilder build();

    public abstract String getDetails();
}
