package lib.PatientComponent;

// ADT for Patient Nation

public class PatientNation {
    private String nation;
    private final String race;
    /**
     * Constructor for Patient Nation
     * @param nation
     * @param race
     */
    public PatientNation(String nation, String race) {
        this.nation = nation;
        this.race = race;
        checkRep();
    }

    /**
     * Rep Invariant
     * - nation and race should not be null
     * Abstraction function:
     * - AF(nation, race) = a Patient Nation with nation and race
     */
    private void checkRep() {
        if (nation == null) {
            throw new RuntimeException("nation is null");
        }
        if (race == null) {
            throw new RuntimeException("race is null");
        }
    }

    /**
     * Getter for nation
     * @return nation
     */
    public String getNotion() {
        return nation;
    }

    /**
     * Getter for race
     * @return race
     */
    public String getRace() {
        return race;
    }
}
