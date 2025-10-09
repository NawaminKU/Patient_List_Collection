import java.io.*;
import java.util.*;

public class Login implements ReadData {
    private String fileName; //ชื่อไฟล์ csv
    private String username; // ชื่อผู้ใช้ที่จะตรวจสอบ
    private String password; // รหัสผ่านที่จะตรวจสอบ

     /**
     * สร้าง Login object
     * @param fileName ชื่อไฟล์ CSV
     * @param username ชื่อผู้ใช้ที่จะตรวจสอบ
     * @param password รหัสผ่านที่จะตรวจสอบ
     */
    public Login(String fileName, String username, String password) {
        this.fileName = fileName; 
        this.username = username; 
        this.password = password; 
    }
    
      /**
     * อ่านข้อมูลจากไฟล์ CSV
     * แต่ละบรรทัดของไฟล์จะถูก split โดยเครื่องหมาย ',' 
     * และเก็บเป็น array ของ String
     * @param fileName ชื่อไฟล์ CSV
     * @return List ของ String[] แต่ละบรรทัดในไฟล์
     * @throws Exception หากเกิดข้อผิดพลาดในการอ่านไฟล์
     */
    public List<String[]> readData(String fileName) throws Exception {
        List<String[]> data = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = br.readLine()) != null) {
            data.add(line.split(",")); // แยก username และ password ด้วย 
        }
        br.close();
        return data;
    }
     /**
     * ตรวจสอบว่า username และ password ตรงกับข้อมูลในไฟล์หรือไม่
     * @return true หาก username และ password ตรงกัน, false หากไม่ตรงหรือเกิดข้อผิดพลาด
     */
    public boolean authenticate() {
        try {
            List<String[]> users = readData(fileName);
            for (String[] user : users) {
                if (user.length >= 2 && user[0].equals(username) && user[1].equals(password)) {
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
}
