package lib;

import java.io.*;
import java.util.*;
import lib.ManageFile.ReadData;

public class Login implements ReadData {
    private String username; // ชื่อผู้ใช้ที่จะตรวจสอบ
    private String password; // รหัสผ่านที่จะตรวจสอบ
    private boolean checking;
    File f;
    FileReader fr;
    BufferedReader br;

     /**
     * สร้าง Login object
     * @param username ชื่อผู้ใช้ที่จะตรวจสอบ
     * @param password รหัสผ่านที่จะตรวจสอบ
     */
    public Login(String username, String password, boolean checking) {
        this.username = username;
        this.password = password;
        this.checking = checking;
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
                String data[] = line.split(",");
                String userCheck = data[3], passCheck = data[4];
                if (id.equals(userCheck) && password.equals(passCheck)) {
                    checking = true;
                    authenticate(checking);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                br.close();
                fr.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public boolean authenticate(boolean checkKey) {
        return checkKey;
    }
}
