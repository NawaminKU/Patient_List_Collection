package lib;
import java.io.*;
import lib.ManageFile.*;

public class ReadWritePatientData implements ReadData, WriteData, EditData {
    File file;
    FileWriter fw;
    BufferedWriter bw;
    FileReader fr;
    BufferedReader br;

    public void readData(String id) {
        try {
            file = new File("./File/Hospital(Patient).csv");
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line;
            boolean found = false;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String ID[] = line.split(",");
                if (id.equals(ID[4])) {
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

    public void writeData(String data) {
        try {
            file = new File("./File/Hospital(Patient).csv");
            fw = new FileWriter(file, true);
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);

            String line;
            boolean found = false;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String ID[] = line.split(",");
                String idData[] = data.split(",");
                if (idData[4].equals(ID[4])) {
                    System.out.println("none write at file");
                    found = true;
                }
            }
            if (!found) {
                bw.write(data);
                bw.newLine();
            }
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
    
    public void editData(String id, String newData) {
        File originalFile = new File("./File/Hospital(Patient).csv");
        File tempFile = new File("./File/Patient_temp.txt");
        boolean found = false;
        try (
            BufferedReader reader = new BufferedReader(new FileReader(originalFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))
        ) {
            String line;
            String header = reader.readLine();
            if (header != null) {
                writer.write(header);
                writer.newLine();
            }
            while ((line = reader.readLine()) != null) {
                String[] ID = line.split(", ");
                if (id.equals(ID[0])) {
                    writer.write(ID[0] + newData);
                    found = true;
                } else {
                    writer.write(line);
                }
                writer.newLine();
            }
            if (!found) {
                System.out.println("No record found for ID: " + id);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while editing the file.");
        }
        // Replace original file with temp file
        if (originalFile.delete()) {
            tempFile.renameTo(originalFile);
        }
    }
}
