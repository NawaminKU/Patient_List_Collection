package lib;
import java.io.*;
import java.util.ArrayList;

public class ShowAll {
    File f;
    FileReader fr;
    BufferedReader br;
    ArrayList<String> patientList;

    public void loadData() {
        try {
            f = new File("./File/Hospital(Patient).csv");
            fr = new FileReader(f);
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
    
//    public static void main(String[] args) {
//        ShowAll sa = new ShowAll();
//        sa.loadData();
//        String str = sa.getAllData().toString();
//        String str_temp = str.replace("[", "")
//                .replace("]", "").replace(",", "#");
//        System.out.println(str_temp);
//    }
}
