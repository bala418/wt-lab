public class q2 {
    // abstract class marks
    abstract static class Marks {
        abstract double getPercentage();
    }

    // class A
    static class A extends Marks {
        double m1, m2, m3;

        A(double m1, double m2, double m3) {
            this.m1 = m1;
            this.m2 = m2;
            this.m3 = m3;
        }

        public double getPercentage() {
            return (m1 + m2 + m3) / 3;
        }
    }

    // class B
    static class B extends Marks {
        double m1, m2, m3, m4;

        B(double m1, double m2, double m3, double m4) {
            this.m1 = m1;
            this.m2 = m2;
            this.m3 = m3;
            this.m4 = m4;
        }

        public double getPercentage() {
            return (m1 + m2 + m3 + m4) / 4;
        }
    }

    public static void main(String[] args) {

        A a = new A(10, 20, 30);
        B b = new B(10, 20, 30, 40);

        System.out.println("Percentage of A: " + a.getPercentage());
        System.out.println("Percentage of B: " + b.getPercentage());

    }
}
