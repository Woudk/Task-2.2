package org.colleg.practice2.task4;

public class DoctorBuilder extends PersonBuilder{
    private String specialty;
    private String department;

    public DoctorBuilder setSpecialty(String specialty) {
        this.specialty = specialty;
        return this;
    }

    public DoctorBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }

    @Override
    public DoctorBuilder build() {
        return this;
    }

    @Override
    public String getDetails() {
        return "Doctor [id: " + id + ", name: " + name + ", specialty: " + specialty + ", department: " + department + "]";
    }
}
