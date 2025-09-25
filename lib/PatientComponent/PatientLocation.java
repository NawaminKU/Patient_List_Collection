package lib.PatientComponent;

// ADT for Patient Location

public class PatientLocation {
    private String numberHouse;
    private String village;
    private String district;
    private String city;

    public PatientLocation(String numberHouse, String village, String district, String city) {
        this.numberHouse = numberHouse;
        this.village = village;
        this.district = district;
        this.city = city;
        checkRep();
    }
    /**
     * Rep Invariant:
     * - numberHouse, village, district, city should be String
     * Abstraction function:
     * - AF(numberHouse, village, district, city) = 
     * a Patient Location with 
     * number house numberHouse, 
     * village village, 
     * district district, 
     * and city city
     */
    private void checkRep() {
        if (!(numberHouse instanceof String)) {
            throw new IllegalArgumentException("numberHouse must be a String");
        }
        if (!(village instanceof String)) {
            throw new IllegalArgumentException("village must be a String");
        }
        if (!(district instanceof String)) {
            throw new IllegalArgumentException("district must be a String");
        }
        if (!(city instanceof String)) {
            throw new IllegalArgumentException("city must be a String");
        }
    }

    /**
     * Getter for numberHouse
     * @return numberHouse
     */
    public String getNumberHouse() {
        return numberHouse;
    }
    
    /**
     * Getter for village
     * @return village
     */
    public String getVillage() {
        return village;
    }

    /**
     * Getter for district
     * @return district
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Getter for city
     * @return city
     */
    public String getCity() {
        return city;
    }
}
