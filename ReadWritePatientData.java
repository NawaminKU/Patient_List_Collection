import java.io.*;

public class ReadWritePatientData implements ReadData, WriteData, EditData {

    public String readData(String fileName) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public void writeData(String fileName, String data) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
            bw.write(data);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void editData(String fileName, String newData) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write(newData);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeData(String newData) {
        throw new UnsupportedOperationException("Unimplemented method 'writeData'");
    }
}
