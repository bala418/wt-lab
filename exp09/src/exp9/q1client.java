package exp9;

import java.io.*;
import java.net.*;

public class q1client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 1234);
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = "", str2 = "";
            while (!str.equals("stop")) {
                str = br.readLine();
                dos.writeUTF(str);
                dos.flush();
                str2 = dis.readUTF();
                System.out.println("Server says: " + str2);
            }
            dos.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
