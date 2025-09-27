package lib;
import lib.TreatmentComponent.*;

public class Treament {
    private final CheckInCheckOut checkInCheckOut;
    private final DoctorSection doctorSection;
    private final DiseaseTreatment diseaseTreatment;
    private final Drug drugs;
    /**
     * Constructor for Treatment
     * @param checkInCheckOut
     * @param doctorSection
     * @param diseaseTreatment
     */
    public Treament(CheckInCheckOut checkInCheckOut, DoctorSection doctorSection, DiseaseTreatment diseaseTreatment, Drug drugs) {
        this.checkInCheckOut = checkInCheckOut;
        this.doctorSection = doctorSection;
        this.diseaseTreatment = diseaseTreatment;
        this.drugs = drugs;
        // checkRep();
    }
    /**
     * Getter for checkInCheckOut
     * @return checkInCheckOut
     */
    public CheckInCheckOut getCheckInCheckOut() {
        return checkInCheckOut;
    }
    /**
     * Getter for doctorSection
     * @return doctorSection
     */
    public DoctorSection getDoctorSection() {
        return doctorSection;
    }
    /**
     * Getter for diseaseTreatment
     * @return diseaseTreatment
     */
    public DiseaseTreatment getDiseaseTreatment() {
        return diseaseTreatment;
    }
    /**
     * Getter for drugs
     * @return drugs
     */
    public Drug getDrugs() {
        return drugs;
    }
}
