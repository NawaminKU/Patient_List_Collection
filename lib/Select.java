package lib;

import lib.ManageFile.ReadData;
import lib.PatientComponent.*;
import java.io.*;

import java.util.List;


public class Select implements ReadData {
    private String selectedPatientID;
    File f;
    FileReader fr;
    BufferedReader br;

    public String getSelectedPatientID() {
        return selectedPatientID;
    }

    @Override
    public void readData(String id) {
        try {
            f = new File("./File/Hospital(Patient).csv");
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String ID[] = line.split(",");
                if (id.equals(ID[4])) {
                    selectedPatientID = line;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

//    public static void main(String[] args) {
//        Select sl = new Select();
//        sl.readData("1234567890124");
//        System.out.println(sl.getSelectedPatientID());
//    }
}
