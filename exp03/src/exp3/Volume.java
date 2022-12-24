package exp3;

public class Volume {

    double volume;

    Volume(int a) {
        volume = a * a * a;
    }

    Volume(double a) {
        volume = 1.333333 * 3.14 * a * a * a;
    }

    Volume(double r, int h) {
        volume = 3.14 * r * r * h;
    }

    public static void main(String args[]) {
        Volume a = new Volume(3);
        Volume b = new Volume(7.0);
        Volume c = new Volume(7.0, 3);

        System.out.println("Volume of cube = " + a.volume);
        System.out.println("Volume of sphere = " + b.volume);
        System.out.println("Volume of cylinder = " + c.volume);

    }
}