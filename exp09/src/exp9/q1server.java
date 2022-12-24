package exp9;

import java.io.*;
import java.net.*;

public class q1server {

    public static void main(String[] args) {

        // tcp server
        try {
            ServerSocket ss = new ServerSocket(1234);
            Socket s = ss.accept();
            System.out.println("Connection established");
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = "", str2 = "";
            while (!str.equals("stop")) {
                str = dis.readUTF();
                System.out.println("Client says: " + str);
                str2 = br.readLine();
                dos.writeUTF(str2);
                dos.flush();
            }
            dis.close();
            s.close();
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
