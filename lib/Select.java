public class Select implements ReadData {

    private String selectedPatientId;
    private Patient foundPatient;           
    private String foundTreatmentData;

    public Select() {
        this.selectedPatientId = "";
        this.foundPatient = null;
        this.foundTreatmentData = "";
    }

    /**
     * เลือกคนไข้ตาม ID
     */
    public void searchPatientId(String id) {
        this.selectedPatientId = id;

        // อ่านข้อมูลจากไฟล์ (ตอนนี้จำลองด้วย readData)
        String rawData = readData(id);

        // CSV: id, fName, lName, birthday, gender, religion, bloodGroup,
        // nation, race, numberHouse, village, district, city,
        // allergicDrug, allergicFood, damageAction, abnormalStatus
        String[] parts = rawData.split(",");
        if (parts.length >= 17) {
            PatientIDCard idCard = new PatientIDCard(parts[0]);
            PatientName name = new PatientName(parts[1], parts[2], parts[3], parts[4], parts[5], parts[6]);
            PatientNation nation = new PatientNation(parts[7], parts[8]);
            PatientLocation location = new PatientLocation(parts[9], parts[10], parts[11], parts[12]);
            PatientWeakness weakness = new PatientWeakness(parts[13], parts[14], parts[15], parts[16]);

            this.foundPatient = new Patient(idCard, name, nation, location, weakness);
        }

        // การรักษา (จริงๆ ต้องอ่านจากไฟล์อื่น)
        this.foundTreatmentData = "Treatment data for patient ID: " + id;
    }

    /** คืนค่า Patient ที่ถูกเลือก */
    public Patient getFoundPatient() {
        return foundPatient;
    }

    /** คืนค่าข้อมูลการรักษาของผู้ป่วยที่เลือก */
    public String getFoundTreatmentData() {
        return foundTreatmentData;
    }

    /** clear การเลือก */
    public void clearSearch() {
        this.selectedPatientId = "";
        this.foundPatient = null;
        this.foundTreatmentData = "";
    }

    public String readData(String id) {
        // จำลองข้อมูล (CSV แบบครบทุก field)
        if (id.equals("1234567890123")) {  // ตัวอย่าง ID 13 หลัก
            return "1234567890123,สมศักดิ์,ลำเลิศ,1990-01-01,ชาย,พุทธ,O,ไทย,เอเชีย,123,บ้านสวน,เมือง,กรุงเทพ,Penicillin,กุ้ง,ออกกำลังกายหนัก,ความดันสูง";
        }
        return id + ",ไม่ทราบ,ไม่ทราบ,2000-01-01,ไม่ทราบ,ไม่ทราบ,ไม่ทราบ,ไม่ทราบ,ไม่ทราบ,0,ไม่ทราบ,ไม่ทราบ,ไม่ทราบ,ไม่ทราบ,ไม่ทราบ,ไม่ทราบ,ไม่ทราบ";
    }
}
