package exp9;

import java.io.*;
import java.net.*;

class UDPCHATServer {
    public static DatagramSocket serversocket;
    public static DatagramPacket dp;
    public static BufferedReader dis;
    public static InetAddress ia;
    public static byte buf[] = new byte[1024];
    public static int cport = 789, sport = 790;

    public static void main(String[] a) throws IOException {
        serversocket = new DatagramSocket(sport);
        dp = new DatagramPacket(buf, buf.length);
        dis = new BufferedReader(new InputStreamReader(System.in));
        ia = InetAddress.getLocalHost();
        System.out.println("Server is Running...");
        while (true) {
            serversocket.receive(dp);
            String str = new String(dp.getData(), 0, dp.getLength());
            if (str.equals("bye")) {
                System.out.println("Terminated...");
                break;
            }
            System.out.println("Client: " + str);
            String str1 = new String(dis.readLine());
            // convert to lower case
            str1 = str1.toLowerCase();
            buf = str1.getBytes();
            serversocket.send(new DatagramPacket(buf, str1.length(), ia, cport));
        }
    }
}
