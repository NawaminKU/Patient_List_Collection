package lib.TreatmentComponent;

public class DoctorSection {
    private String doctor;
    private String section;
    /**
     * Constructor for Doctor Section
     * @param doctor
     * @param section
     */
    public DoctorSection(String doctor, String section) {
        this.doctor = doctor;
        this.section = section;
        checkRep();
    }
    /**
     * Rep Invariant:
     * - doctor and section should not be null
     * Abstraction function:
     * - AF(doctor, section) = a Doctor Section with doctor and section
     */
    private void checkRep() {
        if (doctor == null) {
            throw new RuntimeException("doctor is null");
        }
        if (section == null) {
            throw new RuntimeException("section is null");
        }
    }
    /**
     * Getter for doctor
     * @return doctor
     */
    public String getDoctor() {
        return doctor;
    }
    /**
     * Getter for section
     * @return section
     */
    public String getSection() {
        return section;
    }
}