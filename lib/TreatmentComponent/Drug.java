package lib.TreatmentComponent;

import java.util.ArrayList;

public class Drug {
    private ArrayList<String> drugs;
    private ArrayList<String> tDrug;

    public Drug(ArrayList<String> drug, ArrayList<String> tDrug) {
        this.drugs = drug;
        this.tDrug = tDrug;
        checkRep();
    }

    private void checkRep() {
        if (drugs == null || tDrug == null) {
            throw new RuntimeException("ArrayList is null");
        }
    }

    public String getDrugNames() {
        String saveFileOfDrug = drugs.toString();
        saveFileOfDrug = saveFileOfDrug.replace(",", "#");
        return saveFileOfDrug;
    }

    public String getTypeDrug() {
        String saveFileOfTypeDrug = tDrug.toString();
        saveFileOfTypeDrug = saveFileOfTypeDrug.replace(",", "#");
        return saveFileOfTypeDrug;
    }
}
