package lib.PatientComponent;

// ADT for Patient Tell
public class PatientTell {
    private String tellPatint;
    private String tellCousin1;
    private String tellCousin2;
    private String tellCousin3;

    public PatientTell(String tellPatint, String tellCousin1, String tellCousin2, String tellCousin3) {
        this.tellPatint = tellPatint;
        this.tellCousin1 = tellCousin1;
        this.tellCousin2 = tellCousin2;
        this.tellCousin3 = tellCousin3;
         checkRep();
    }
    /**
     * Rep Invariant:
     * - tellPatint, tellCousin1, tellCousin2, tellCousin3 should be String
     * Abstraction function:
     * - AF(tellPatint, tellCousin1, tellCousin2, tellCousin3) = 
     * a Patient Tell with 
     * patient telephone number tellPatint, 
     * cousin 1 telephone number tellCousin1, 
     * cousin 2 telephone number tellCousin2, 
     * and cousin 3 telephone number tellCousin3
     */
    private void checkRep() {
         if (!(tellPatint instanceof String)) {
             throw new IllegalArgumentException("tellPatint must be a String");
         }
         if (!(tellCousin1 instanceof String)) {
             throw new IllegalArgumentException("tellCousin1 must be a String");
         }
         if (!(tellCousin2 instanceof String)) {
             throw new IllegalArgumentException("tellCousin2 must be a String");
         }
         if (!(tellCousin3 instanceof String)) {
             throw new IllegalArgumentException("tellCousin3 must be a String");
         }
    }
    /**
     * Getter for tellPatint
     * @return tellPatint
     */
    public String getTellPatint() {
        if (tellPatint == null || tellPatint.equals("")) {
            return "-";
        }
        return tellPatint;
    }
    /**
     * Getter for tellCousin1
     * @return tellCousin1
     */
    public String getTellCousin1() {
        if (tellCousin1 == null || tellCousin1.equals("")) {
            return "-";
        }
        return tellCousin1;
    }
    /**
     * Getter for tellCousin2
     * @return tellCousin2
     */
    public String getTellCousin2() {
        if (tellCousin2 == null || tellCousin2.equals("")) {
            return "-";
        }
        return tellCousin2;
    }
    /**
     * Getter for tellCousin3
     * @return tellCousin3
     */
    public String getTellCousin3() {
        if (tellCousin3 == null || tellCousin3.equals("")) {
            return "-";
        }
        return tellCousin3;
    }
}
