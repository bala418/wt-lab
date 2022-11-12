package exp8;

import java.util.*;
import java.io.*;

public class q1 {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<String>();

        try {
            FileInputStream fis = new FileInputStream("q1input.txt");
            Scanner sc = new Scanner(fis);
            while (sc.hasNext()) {
                words.add(sc.next());
            }
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        // hashmap to store words frequency
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        Collections.sort(words);

        // add words from arraylist
        for (String word : words) {
            Integer count = hm.get(word);
            hm.put(word, (count == null) ? 1 : count + 1);
        }

        // print it in a file
        try {
            FileWriter fw = new FileWriter("q1output.txt");
            for (Map.Entry<String, Integer> entry : hm.entrySet()) {
                fw.write(entry.getKey() + " " + entry.getValue() + " times ");
                fw.write(System.getProperty("line.separator"));
            }
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            FileOutputStream fos = new FileOutputStream("q1output2.txt");
            // sort words in hashmap
            TreeMap<String, Integer> sorted = new TreeMap<String, Integer>(hm);
            for (Map.Entry<String, Integer> entry : sorted.entrySet()) {
                String str = entry.getKey() + " " + entry.getValue() + " times ";
                fos.write(str.getBytes());
                fos.write(System.getProperty("line.separator").getBytes());
            }

            // sort words according to frequency
            Collections.sort(words, new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    return hm.get(s2).compareTo(hm.get(s1));
                }
            });
            fos.write(System.getProperty("line.separator").getBytes());
            for (String word : words) {
                fos.write(word.getBytes());
                fos.write(" ".getBytes());
            }

            fos.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}