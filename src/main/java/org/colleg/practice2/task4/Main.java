package org.colleg.practice2.task4;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        HospitalDirector director = new HospitalDirector();

        DoctorBuilder doctorBuilder = new DoctorBuilder();
        doctorBuilder.setId(1);
        doctorBuilder.setName("Dr. Smith");
        doctorBuilder.setSpecialty("Cardiology");
        doctorBuilder.setDepartment("Cardiology Department");;

        director.setBuilder(doctorBuilder);
        DoctorBuilder doctor = (DoctorBuilder) director.construct();
        System.out.println(doctor.getDetails());

        int patientYearOfBirth = 1990;
        PatientBuilder patientBuilder = new PatientBuilder();
        patientBuilder.setId(101);
        patientBuilder.setName("John Doe");
        patientBuilder.setDate(patientYearOfBirth);
        patientBuilder.setMedicalRecords(List.of("Record 1", "Record 2"));

        director.setBuilder(patientBuilder);
        PatientBuilder patient = (PatientBuilder) director.construct();
        System.out.println(patient.getDetails());
    }

}