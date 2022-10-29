package exp8;

import java.io.*;

public class q3 {

    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("q3input.txt");
            FileWriter fw = new FileWriter("q3output.txt");
            int c;
            while ((c = fr.read()) != -1) {
                if (Character.isLowerCase(c)) {
                    c = Character.toUpperCase(c);
                }
                fw.write(c);
            }
            fr.close();
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
