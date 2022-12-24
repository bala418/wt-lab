public class q4 {

    static class trainJourney {
        String starting_from;
        String destination;
        int j_time;

        trainJourney() {
            System.out.println("Train Journey");
        }

        void set_starting_from(String s) {
            starting_from = s;
        }

        void set_destination(String d) {
            destination = d;
        }

        void set_j_time(int j_time) {
            this.j_time = j_time;
        }
    }

    // freight extends train
    static class freight extends trainJourney {
        freight() {
            super();
            System.out.println("Freight");
        }

        final int capacity = 10;
        int carriages;
        boolean hazard;

        int get_capacity() {
            return capacity;
        }

        void set_hazard(boolean h) {
            hazard = h;
        }
    }

    // passenger extends train
    static class passenger extends trainJourney {
        passenger() {
            super();
            System.out.println("Passenger");
        }

        int fc;
        int carraiges;
        boolean catergory;

        int get_fc() {
            return fc;
        }

        // add carriages
        void add_carriages(int c) {
            carraiges += c;
        }

        boolean get_catergory() {
            return catergory;
        }
    }

    public static void main(String[] args) {

        // create passenger variable using super
        passenger p = new passenger();
        p.set_starting_from("Mumbai");
        p.set_destination("Delhi");
        p.set_j_time(24);

        // create freight variable using super
        freight f = new freight();
        f.set_starting_from("Mumbai");
        f.set_destination("Delhi");
        f.set_j_time(24);

        // print passenger
        System.out.println("Passenger");
        System.out.println("Starting from: " + p.starting_from);
        System.out.println("Destination: " + p.destination);
        System.out.println("Journey time: " + p.j_time);

        // print freight
        System.out.println("Freight");
        System.out.println("Starting from: " + f.starting_from);
        System.out.println("Destination: " + f.destination);
        System.out.println("Journey time: " + f.j_time);
        System.out.println("Frieght Capacity = " + f.capacity);

    }
}
