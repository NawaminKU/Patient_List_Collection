package lib.TreatmentComponent;

import java.util.ArrayList;

public class Drug {
    private String drugs;
    private String tDrug;

    public Drug(String drug, String tDrug) {
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
        return drugs;
    }

    public String getTypeDrug() {
        return tDrug;
    }
}
