package lib.PatientComponent;

// ADT for Patient Weakness

public class PatientWeakness {
    private String allergicDrug;
    private String allergicFood;
    private String damageAction;
    private String abnormalStatus;

    public PatientWeakness(String allergicDrug, String allergicFood, String damageAction, String abnormalStatus) {
        this.allergicDrug = allergicDrug;
        this.allergicFood = allergicFood;
        this.damageAction = damageAction;
        this.abnormalStatus = abnormalStatus;
        checkRep();
    }

    /**
     * Rep Invariant:
     * - allergicDrug, allergicFood, damageAction, abnormalStatus should be String.
     * Abstraction function:
     * - AF(allergicDrug, allergicFood, damageAction, abnormalStatus) = 
     * a Patient Weakness with 
     * allergic drug allergicDrug, 
     * allergic food allergicFood, 
     * damage action damageAction, 
     * and abnormal status abnormalStatus
     */
    private void checkRep() {
        if (!(allergicDrug instanceof String)) {
            throw new IllegalArgumentException("allergicDrug must be a String");
        }
        if (!(allergicFood instanceof String)) {
            throw new IllegalArgumentException("allergicFood must be a String");
        }
        if (!(damageAction instanceof String)) {
            throw new IllegalArgumentException("damageAction must be a String");
        }
        if (!(abnormalStatus instanceof String)) {
            throw new IllegalArgumentException("abnormalStatus must be a String");
        }
    }

    /**
     * Getter for allergicDrug
     * @return allergicDrug
     */
    public String getAllergicDrug() {
        if (allergicDrug == null || allergicDrug.equals("")) {
            return "-";
        }
        return allergicDrug;
    }
    
    /**
     * Getter for allergicFood
     * @return allergicFood
     */
    public String getAllergicFood() {
        if (allergicFood == null || allergicFood.equals("")) {
            return "-";
        }
        return allergicFood;
    }

    /**
     * Getter for damageAction
     * @return damageAction
     */
    public String getDamageAction() {
        if (damageAction == null || damageAction.equals("")) {
            return "-";
        }
        return damageAction;
    }

    /**
     * Getter for abnormalStatus
     * @return abnormalStatus
     */
    public String getAbnormalStatus() {
        if (abnormalStatus == null || abnormalStatus.equals("")) {
            return "-";
        }
        return abnormalStatus;
    }
}
