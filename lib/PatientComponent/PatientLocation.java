package lib.PatientComponent;

// ADT for Patient Location

public class PatientLocation {
    private String numberHouse;
    private String village;
    private String road;
    private String sub_District;
    private String district;
    private String city;

    public PatientLocation(String numberHouse, String village, String road, String sub_District, String district, String city) {
        this.numberHouse = numberHouse;
        this.village = village;
        this.road = road;
        this.sub_District = sub_District;
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
        if (numberHouse == null || numberHouse.equals("")) {
            throw new IllegalArgumentException("numberHouse not must be a null");
        }
        if (village == null || village.equals("")) {
            throw new IllegalArgumentException("village not must be a null");
        }
        if (road == null || village.equals("")) {
            road = "-";
        }
        if (district == null || district.equals("")) {
            throw new IllegalArgumentException("district not must be a null");
        }
        if (city == null || city.equals("")) {
            throw new IllegalArgumentException("city not must be a null");
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

    public String getRoad() {
        return road;
    }

    public  String getSub_District() {
        return sub_District;
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
