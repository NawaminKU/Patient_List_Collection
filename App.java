
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import lib.Patient;
import lib.PatientComponent.*;
import lib.ReadWritePatientData;
import lib.Treament;
import lib.TreatmentComponent.CheckInCheckOut;
import lib.TreatmentComponent.DiseaseTreatment;
import lib.TreatmentComponent.DoctorSection;
import lib.TreatmentComponent.Drug;

import javax.imageio.ImageIO;

public class  App {
    public static void main(String[] args) {
        // Components of Patient
        PatientIDCard ID = new PatientIDCard("1234567890123");
        PatientLocation Loc = new PatientLocation("123","6","kps","Nakhon pathom");
        PatientTell Tell = new PatientTell("","","","");
        PatientName Name = new PatientName("Mr.","Nawamin", "Thong", "01/08/2005", "M", "", "");
        PatientNation Nation = new PatientNation("Thai", "Thai");
        PatientWeakness Weak = new PatientWeakness("", "", "", "");

        // Patient ADT test
        Patient P = new Patient(ID, Name, Nation, Loc, Weak, Tell, "ME");

        // writing data to file csv
        String str =
                P.getName().getTitle() + "," + P.getName().getfName() + "," + P.getName().getlName() + "," + P.getName().getBirthday() + "," + P.getID().getIdCard() + "," + P.getNation().getNotion() + "," + P.getNation().getRace()
                + "," + P.getName().getReligion() + "," + P.getLocation().getNumberHouse() + "," + P.getLocation().getVillage() + "," + P.getLocation().getDistrict() + "," + P.getLocation().getCity()
                + "," + P.getName().getGender() + "," + P.getTell().getTellPatint() + "," + P.getTell().getTellCousin1() + "," + P.getTell().getTellCousin2() + "," + P.getTell().getTellCousin3()
                + "," + P.getName().getBloodGroup() + "," + P.getWeakness().getAbnormalStatus() + "," + P.getWeakness().getAllergicDrug() + "," + P.getWeakness().getAllergicFood() + "," + P.getWeakness().getDamageAction()
                + "," + P.getImage();
        ReadWritePatientData pd = new ReadWritePatientData();
        pd.writeData(str);
    }
}