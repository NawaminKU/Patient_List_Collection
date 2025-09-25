import lib.Patient;
import lib.PatientComponent.PatientIDCard;
import lib.PatientComponent.PatientLocation;
import lib.PatientComponent.PatientName;
import lib.PatientComponent.PatientNation;
import lib.PatientComponent.PatientTell;
import lib.PatientComponent.PatientWeakness;
import lib.TreatmentComponent.CheckInCheckOut;
import lib.TreatmentComponent.DiseaseTreatment;
import lib.TreatmentComponent.DoctorSection;
import lib.Treament;




public class  App {
    public static void main(String[] args) {
        PatientIDCard idCard = new PatientIDCard("1234567890123");
        PatientNation nation = new PatientNation("USA", "United States of America");
        PatientLocation location = new PatientLocation("New York", "NY", "USA", "10001");
        PatientName name = new PatientName("John", "Doe", "1/1/11", "Male", null, null);
        PatientTell tell = new PatientTell("123-456-7890", "098-765-4321", null, null);
        PatientWeakness weakness = new PatientWeakness("null", "null", "null", "null");
        Patient patient = new Patient(idCard, name, nation, location, weakness);  
        
        System.out.println("Patient ID Card: " + idCard.getIdCard());
        System.out.println("Patient Name: " + name.getfName() + " " + name.getlName());
        System.out.println("Patient Birthday: " + name.getBirthday());
        System.out.println(patient.getNation().getRace());

        CheckInCheckOut checkInCheckOut = new CheckInCheckOut("2023-10-01", "2023-10-10");
        DiseaseTreatment diseaseTreatment = new DiseaseTreatment("Flu", "Rest and hydration", "", "", "", "", "");
        DoctorSection doctorSection = new DoctorSection("Dr. Smith", "General Practitioner");
        Treament treatment = new Treament(checkInCheckOut, doctorSection, diseaseTreatment);
        System.out.println("Check-In Date: " + checkInCheckOut.getCheckIn());
        System.out.println(treatment.getDiseaseTreatment().getDisease());
    }
}