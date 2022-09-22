public class q3 {

    static class OnlineBook {
        String name;
        String publisher;
        int year;
        int edition;
        double price;

        // function
        public double getPrice() {
            return price;
        }

    }

    static class TechBook extends OnlineBook {
        String language;
        String framework;

        public double getPrice() {
            return price * 0.9;
        }
    }

    static class NonTechBook extends OnlineBook {
        String author;
        String genre;

        public double getPrice() {
            return price * 0.8;
        }
    }

    static void print(Object o) {
        System.out.println(o);
    }

    static void print(OnlineBook o) {
        print("Name: " + o.name);
        print("Publisher: " + o.publisher);
        print("Year: " + o.year);
        print("Edition: " + o.edition);
        print("Price: " + o.price);
    }

    public static void main(String[] args) {

        // upcasting
        OnlineBook ob = new TechBook();
        ob.name = "Java";
        ob.publisher = "Oracle";
        ob.year = 2019;
        ob.edition = 1;
        ob.price = 1000;

        OnlineBook ob2 = new NonTechBook();
        ob2.name = "Harry Potter";
        ob2.publisher = "Bloomsbury";
        ob2.year = 1997;
        ob2.edition = 1;
        ob2.price = 1000;

        // downcasting
        TechBook tb = (TechBook) ob;
        tb.language = "Java";
        tb.framework = "Spring";

        print(tb);
        print("");

        NonTechBook ntb = (NonTechBook) ob2;
        ntb.author = "J.K. Rowling";
        ntb.genre = "Fantasy";

        print(ntb);
    }
}
