package exp8;

import java.io.*;

public class q2 {

    public static class country implements java.io.Serializable {
        String name;
        String continent;
        transient int population;

        public country(String name, String continent, int population) {
            this.name = name;
            this.continent = continent;
            this.population = population;
        }
    }

    public static void main(String[] args) {
        // serialize name and continent
        try {
            FileOutputStream fos = new FileOutputStream("q2output.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(new country("India", "Asia", 1000000000));
            oos.close();
            fos.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        // deserialize name and continent
        try {
            FileInputStream fis = new FileInputStream("q2output.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            country c = (country) ois.readObject();
            System.out.println(c.name + " " + c.continent + " " + c.population);
            ois.close();
            fis.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
