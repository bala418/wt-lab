public class q2 {
    static class country {
        country() {
            System.out.println("Country");
        }
    }

    static class state extends country {
        state() {
            System.out.println("State");
        }
    }

    static class city extends state {
        city() {
            System.out.println("City");
        }
    }

    static class village extends city {
        village() {
            System.out.println("Village");
        }
    }

    public static void main(String[] args) {
        village v = new village();
    }
}
