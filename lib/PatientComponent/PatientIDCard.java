package lib.PatientComponent;

// ADT for Patient ID Card

public class PatientIDCard {
    private final String idCard;

    /**
     * Constructor for PatientIDCard
     * @param idCard ID Card number
     */
    public PatientIDCard(String idCard) {
        this.idCard = idCard;
        checkRep();
    }

    /**
     *  Rep invariant:
     * - idCard is not null
     * - idCard length is 13
     * Abstraction function:
     * - AF(idCard) = a Patient ID Card with ID number idCard
     */
    private void checkRep() {
        if (idCard == null || idCard.length() != 13) {
            throw new RuntimeException("ID Card must be 18 characters long");
        }
    }

    /**
     * Getter for idCard
     * @return idCard
     */
    public String getIdCard() {
        return idCard;
    }
}
