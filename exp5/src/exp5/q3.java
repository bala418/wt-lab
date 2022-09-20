package exp5;

public class q3 {

    static class vehicle {
        String name;
        int wheels;

        void print() {
            System.out.println("Name: " + name);
            System.out.println("Wheels: " + wheels);
        }
    }

    static class two_wheeler extends vehicle {
        two_wheeler() {
            name = "Bike";
            wheels = 2;
        }
    }

    static class three_wheeler extends vehicle {
        three_wheeler() {
            name = "Three Wheeler";
            wheels = 3;
        }
    }

    static class four_wheeler extends vehicle {
        four_wheeler() {
            name = "Four Wheeler";
            wheels = 4;
        }
    }

    public static void main(String[] args) {

        two_wheeler t = new two_wheeler();
        t.print();

        three_wheeler th = new three_wheeler();
        th.print();

        four_wheeler f = new four_wheeler();
        f.print();

    }
}
