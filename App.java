
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lib.TreatmentComponent.CheckInCheckOut;
import lib.TreatmentComponent.DoctorSection;
import lib.TreatmentComponent.DiseaseTreatment;
import lib.TreatmentComponent.Drug;

import lib.Treament;





public class  App {
    public static void main(String[] args) {
        // PatientIDCard idCard = new PatientIDCard("1234567890123");
        // PatientNation nation = new PatientNation("USA", "United States of America");
        // PatientLocation location = new PatientLocation("New York", "NY", "USA", "10001");
        // PatientName name = new PatientName("John", "Doe", "1/1/11", "Male", null, null);
        // PatientTell tell = new PatientTell("123-456-7890", "098-765-4321", null, null);
        // PatientWeakness weakness = new PatientWeakness("null", "null", "null", "null");
        // Patient patient = new Patient(idCard, name, nation, location, weakness);  
        
        // System.out.println("Patient ID Card: " + idCard.getIdCard());
        // System.out.println("Patient Name: " + name.getfName() + " " + name.getlName());
        // System.out.println("Patient Birthday: " + name.getBirthday());
        // System.out.println(patient.getNation().getRace());
        String[] drugList = {"Paracetamol", "Ibuprofen", "Amoxicillin"};
        String[] tDrugList = {"500mg", "200mg", "250mg"};

        CheckInCheckOut checkInCheckOut = new CheckInCheckOut("2023-10-01", "2023-10-10");
    DiseaseTreatment diseaseTreatment = new DiseaseTreatment("Flu", "Rest and hydration", "d", "d", "d");
        DoctorSection doctorSection = new DoctorSection("Dr. Smith", "General Practitioner");
        Drug drug = new Drug(new ArrayList<>(List.of(drugList)), new ArrayList<>(List.of(tDrugList)));
        Treament treatment = new Treament(checkInCheckOut, doctorSection, diseaseTreatment, drug);
        System.out.println("Check-In Date: " + checkInCheckOut.getCheckIn());
        System.out.println(treatment.getDiseaseTreatment().getDisease());
        System.out.println("Prescribed Drugs: " + treatment.getDrugs().getDrugNames());

    }
}