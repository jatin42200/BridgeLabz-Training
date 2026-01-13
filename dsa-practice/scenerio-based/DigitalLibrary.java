import java.util.ArrayList;
import java.util.List;

// 1. Book Model
class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book: '" + title + "' by " + author;
    }
}

// 2. SmartShelf Manager
class SmartShelf {
    private List<Book> readingList = new ArrayList<>();

    // Real-time sorting logic using Insertion Sort principles
    public void addBook(String title, String author) {
        Book newBook = new Book(title, author);
        
        // Agar list khali hai to pehli book add kardo
        if (readingList.isEmpty()) {
            readingList.add(newBook);
        } else {
            // Find the correct position and insert (Insertion Sort logic)
            int i = readingList.size() - 1;
            readingList.add(newBook); // Temporarily add at the end

            // Shift elements to find the right spot (Alphabetical order)
            while (i >= 0 && readingList.get(i).title.compareToIgnoreCase(newBook.title) > 0) {
                readingList.set(i + 1, readingList.get(i)); // Shift forward
                i--;
            }
            readingList.set(i + 1, newBook); // Insert at correct position
        }
        System.out.println("Added: " + title);
    }

    public void displayShelf() {
        System.out.println("\n--- Current SmartShelf (Sorted) ---");
        for (Book b : readingList) {
            System.out.println(b);
        }
        System.out.println("-----------------------------------\n");
    }
}

// 3. Main Execution
public class DigitalLibrary {
    public static void main(String[] args) {
        SmartShelf myShelf = new SmartShelf();

        // Adding books one by one (Real-time sorting)
        myShelf.addBook("Java Basics", "Herbert");
        myShelf.addBook("Alchemist", "Paulo Coelho");
        myShelf.displayShelf();

        myShelf.addBook("Data Structures", "Lipschutz");
        myShelf.addBook("C++ Mastery", "Balagurusamy");
        myShelf.displayShelf();

        myShelf.addBook("Atomic Habits", "James Clear");
        myShelf.displayShelf();
    }
}
