package exp4;

public class q5 {

    static int bookCount = 0;
    static String[] books = new String[10];

    static {
        System.out.println("Welcome to library management system");
    }

    static void addBook(String book) {
        if (bookCount < 10) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("No more books can be added");
        }
    }

    static void displayBooks() {
        System.out.println("Books in library are: ");
        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i]);
        }
    }

    public static void main(String[] args) {
        addBook("Java");
        addBook("C++");
        addBook("Python");
        displayBooks();
    }
}
