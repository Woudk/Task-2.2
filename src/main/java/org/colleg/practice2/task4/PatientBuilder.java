package org.colleg.practice2.task4;
import java.util.List;
public class PatientBuilder extends PersonBuilder{
    private int date;
    private List<String> medicalRecords;

    public PatientBuilder setDate(int date) {
        this.date = date;
        return this;
    }

    public PatientBuilder setMedicalRecords(List<String> medicalRecords) {
        this.medicalRecords = medicalRecords;
        return this;
    }

    @Override
    public PatientBuilder build() {
        return this;
    }

    @Override
    public String getDetails() {
        return "Patient [id: " + id + ", name: " + name + ", date: " + date + ", medicalRecords: " + medicalRecords + "]";
    }
}
