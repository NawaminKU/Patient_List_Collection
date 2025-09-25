package lib.TreatmentComponent;

// ADT for Check In Check Out
public class CheckInCheckOut {
    private final String checkIn;
    private final String checkOut;
    /**
     * Constructor for Check In Check Out
     * @param checkIn
     * @param checkOut
     */
    public CheckInCheckOut(String checkIn, String checkOut) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        checkRep();
    }
    /**
     * Rep Invariant:
     * - checkIn and checkOut should not be null
     * Abstraction function:
     * - AF(checkIn, checkOut) = a Check In Check Out with check in date checkIn and check out date checkOut
     */
    private void checkRep() {
        if (checkIn == null) {
            throw new RuntimeException("checkIn is null");
        }
        if (checkOut == null) {
            throw new RuntimeException("checkOut is null");
        }
    }
    /**
     * Getter for checkIn
     * @return checkIn
     */
    public String getCheckIn() {
        return checkIn;
    }
    /**
     * Getter for checkOut
     * @return checkOut
     */
    public String getCheckOut() {
        return checkOut;
    }
}
