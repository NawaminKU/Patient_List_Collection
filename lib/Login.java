package lib;

import java.io.*;
import java.util.*;
import lib.ManageFile.ReadData;

public class Login implements ReadData {
    private String username; // ชื่อผู้ใช้ที่จะตรวจสอบ
    private String password; // รหัสผ่านที่จะตรวจสอบ
    File f;
    FileReader fr;
    BufferedReader br;

     /**
     * สร้าง Login object
     * @param username ชื่อผู้ใช้ที่จะตรวจสอบ
     * @param password รหัสผ่านที่จะตรวจสอบ
     */
    public Login(String username, String password) {
        this.username = username; 
        this.password = password; 
    }


    @Override
    public void readData(String id) {
        try {
            f = new File("./File/Doctor.csv");
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            String line;
            br.readLine();
            while((line = br.readLine()) != null) {

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
