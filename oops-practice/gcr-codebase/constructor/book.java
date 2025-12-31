//here we create class and object
class BookConst {
    String title;
    String author;
    double price;

    // Default constructor
    public BookConst() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    public BookConst(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println(title + " | " + author + " | ₹" + price);
    }
}
class Book{
    public static void main(String[]args)
    {

    BookConst bc=new BookConst("coder","jatin",299.00);
    bc.display();
            
    }

}
