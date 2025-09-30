package lib;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import lib.ManageFile.*;
import lib.TreatmentComponent.*;

public class ReadWriteTreatment implements ReadData, WriteData {
    File file;
    FileWriter fw;
    BufferedWriter bw;
    FileReader fr;
    BufferedReader br;

    @Override
    public void writeData(String data) {
        try {
            file = new File("./File/treatment.txt");
            fw = new FileWriter(file, true);
            bw = new BufferedWriter(fw);
            bw.write(data);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
                System.out.println("An error occurred while closing the file.");
            }
        }
    }

    @Override
    public void readData(String id) {
        try {
            file = new File("./File/treatment.txt");
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line;
            boolean found = false;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String ID[] = line.split(", ");
                if (id.equals(ID[0])) {
                    System.out.println("Record found: " + line);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No record found for ID: " + id);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException ex) {
                System.out.println("An error occurred while closing the file.");
            }
        }
    }
    public static void main(String[] args) {
        CheckInCheckOut checkInCheckOut = new CheckInCheckOut("2023-10-01", "2023-10-10");
        DoctorSection doctorSection = new DoctorSection("Dr. Smith", "Cardiology");
        DiseaseTreatment diseaseTreatment = new DiseaseTreatment("Hypertension", "Low sodium diet", "d", "d", "d");
        Drug drug = new Drug(new ArrayList<>(List.of("Lisinopril")), new ArrayList<>(List.of("10mg")));
        Treament treatment = new Treament(
            checkInCheckOut, 
            doctorSection,
            diseaseTreatment,
            drug
        );
        
        ReadWriteTreatment rwt = new ReadWriteTreatment();
        // rwt.writeData("1234567, " + treatment.getCheckInCheckOut().getCheckIn() + ", " + treatment.getDoctorSection().getDoctor() + ", " + treatment.getDiseaseTreatment().getDisease() + ", " + treatment.getDrugs().getDrugNames());
        rwt.readData("1234567");
    }
}
