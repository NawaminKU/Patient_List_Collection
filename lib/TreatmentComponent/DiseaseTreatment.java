package lib.TreatmentComponent;

public class DiseaseTreatment {
    private String disease;
    private String medicalTreatment;
    private String tPatient;
    private String rights;
    private String pressure;

    public DiseaseTreatment(String disease, String medicalTreatment, String tPatient, String rights, String pressure) {
        this.disease = disease;
        this.medicalTreatment = medicalTreatment;
        this.tPatient = tPatient;
        this.rights = rights;
        this.pressure = pressure;
        checkRep();
    }
    private void checkRep() {
        if (disease == null) {
            throw new RuntimeException("disease is null");
        }
        if (medicalTreatment == null) {
            throw new RuntimeException("medicalTreatment is null");
        }
        if (tPatient == null) {
            throw new RuntimeException("tPatient is null");
        }
        if (rights == null) {
            throw new RuntimeException("rights is null");
        }
        if (pressure == null) {
            throw new RuntimeException("pressure is null");
        }
    }
    public String getDisease() {
        return disease;
    }
    public String getMedicalTreatment() {
        return medicalTreatment;
    }
    public String gettPatient() {
        return tPatient;
    }
    public String getRights() {
        return rights;
    }
    public String getPressure() {
        return pressure;
    }
}
