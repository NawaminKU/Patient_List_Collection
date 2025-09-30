package lib;
import java.io.*;
import java.util.ArrayList;

public class ShowAll {
    File file;
    FileReader fr;
    BufferedReader br;
    ArrayList<String> patientList;

    public void loadData() {
        try {
            file = new File("./File/treatment.txt");
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            patientList = new ArrayList<>();
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                patientList.add(line + "\n");
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

    public ArrayList<String> getAllData() {
        return patientList;
    }
    
    public static void main(String[] args) {
        ShowAll sa = new ShowAll();
        sa.loadData();
        System.out.println(sa.getAllData());
    }
}
