package lib.PatientComponent;

// ADT for Patient Name birthday gender religion bloodGroup

public class PatientName {
    private String fName;
    private String lName;
    private final String birthday;
    private String gender;
    private String religion;
    private String bloodGroup;

    /**
     * Constructor for Patient Name
     * @param fName
     * @param lName
     * @param birthday
     * @param gender
     * @param religion
     * @param bloodGroup
     */
    public PatientName(String fName, String lName, String birthday, String gender, String religion, String bloodGroup) {
        this.fName = fName;
        this.lName = lName;
        this.birthday = birthday;
        this.religion = religion;
        this.bloodGroup = bloodGroup;
    }
    /**
     * Rep Invariant:
     * - fName, lName, birthday, gender should not be null
     * Abstraction function:
     * - AF(fName, lName, birthday, gender, religion, bloodGroup) = 
     * a Patient Name with birthday,
     * first name fName, gender, religion, blood group
     */
    private void checkRep() {
        if (fName == null) {
            throw new RuntimeException("fName is null");
        }
        if (lName == null) {
            throw new RuntimeException("lName is null");
        }
        if (birthday == null) {
            throw new RuntimeException("birthday is null");
        }
        if (gender == null) {
            throw new RuntimeException("gender is null");
        }
    }

    /**
     * Getter for fName
     * @return fName
     */
    public String getfName() {
        return fName;
    }

    /**
     * Getter for lName
     * @return lName
     */
    public String getlName() {
        return lName;
    }

    /**
     * Getter for birthday
     * @return birthday
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * Getter for religion
     * @return religion
     */
    public String getReligion() {
        return religion;
    }
    
    /**
     * Getter for bloodGroup
     * @return bloodGroup
     */
    public String getBloodGroup() {
        return bloodGroup;
    }
}
