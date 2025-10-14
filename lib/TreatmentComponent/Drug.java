package lib.TreatmentComponent;

import java.util.ArrayList;

public class Drug {
    private ArrayList<String> drugs;
    private ArrayList<String> tDrug;

    public Drug(ArrayList<String> drug, ArrayList tDrug) {
        this.drugs = drug;
        this.tDrug = tDrug;
        checkRep();
    }

    private void checkRep() {
        if (drugs == null || tDrug == null) {
            throw new RuntimeException("ArrayList is null");
        }
    }

    public ArrayList<String> getDrugNames() {
        return drugs;
    }
    public ArrayList<String> gettDrug() {
        return tDrug;
    }
}
