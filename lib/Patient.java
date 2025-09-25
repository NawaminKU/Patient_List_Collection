package lib;
import lib.PatientComponent.*;

public class Patient {
    private PatientIDCard idCard;
    private PatientName name;
    private PatientNation nation;
    private PatientLocation location;
    private PatientWeakness weakness;
    /**
     * Constructor for Patient
     * @param idCard
     * @param name
     * @param nation
     * @param location
     * @param weakness
     */
    public Patient(PatientIDCard idCard, PatientName name, PatientNation nation, PatientLocation location, PatientWeakness weakness) {
        this.idCard = idCard;
        this.name = name;
        this.nation = nation;
        this.location = location;
        this.weakness = weakness;
        checkRep();
    }

    /**
     * Rep Invariant:
     * - idCard, name, nation, location, weakness should be non-null
     * Abstraction function:
     * - AF(idCard, name, nation, location, weakness) =
     */
    private void checkRep() {
        if (idCard == null) {
            throw new IllegalArgumentException("idCard must be non-null");
        }
        if (name == null) {
            throw new IllegalArgumentException("name must be non-null");
        }
        if (nation == null) {
            throw new IllegalArgumentException("nation must be non-null");
        }
        if (location == null) {
            throw new IllegalArgumentException("location must be non-null");
        }
        if (weakness == null) {
            throw new IllegalArgumentException("weakness must be non-null");
        }
    }

    /**
     * Getter for idCard
     * @return idCard
     */
    public PatientIDCard getIdCard() {
        return idCard;
    }
    /**
     * Getter for name
     * @return name
     */
    public PatientName getName() {
        return name;
    }
    /**
     * Getter for nation
     * @return nation
     */
    public PatientNation getNation() {
        return nation;
    }
    /**
     * Getter for location
     * @return location
     */
    public PatientLocation getLocation() {
        return location;
    }
    /**
     * Getter for weakness
     * @return weakness
     */
    public PatientWeakness getWeakness() {
        return weakness;
    }
}
