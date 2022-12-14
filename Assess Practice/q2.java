class circle {
    double peri;

    circle(double x) {
        peri = 3.14 * 2 * x;
    }
}

public class q2 {
    public static void main(String[] args) {
        circle a = new circle(7);
        System.out.println("Perimeter of circle = " + a.peri);
    }
}
