class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book not available");
        }
    }

    public void display() {
        System.out.println(title + " | " + author + " | ₹" + price + " | Available: " + available);
    }
}
class Library {
    public static void main(String[] args) {

        LibraryBook book = new LibraryBook("Java Basics", "Jimmy jimmy", 69);

        book.display();
        book.borrowBook();
        book.display();
    }
}
