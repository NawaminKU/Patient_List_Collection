package lib;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import lib.ManageFile.*;
import lib.TreatmentComponent.*;

public class ReadWriteTreatmentData implements ReadData, WriteData {
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
            file = new File("./File/Hospital(Treatment).csv");
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

}
