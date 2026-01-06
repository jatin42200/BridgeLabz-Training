import java.util.*;

class BookNotAvailableException extends Exception {
    BookNotAvailableException(String msg) {
        super(msg);
    }
}

public class LibraryManagementSystem {
    static String[] titles = {"Java Programming", "Data Structures", "Python Basics", "Web Development", "Operating Systems"};
    static String[] authors = {"James Gosling", "Mark Allen", "Guido van Rossum", "Tim Berners-Lee", "Abraham Silberschatz"};
    static boolean[] isAvailable = {true, true, true, true, true};
    
    static List<Integer> bookList = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Initialize book index list
        for (int i = 0; i < titles.length; i++) {
            bookList.add(i);
        }

        System.out.println("--- Current Library Catalog ---");
        displayBooks();
        
        System.out.print("\nEnter keyword to search book: ");
        String keyword = sc.nextLine(); // Changed to nextLine()
        searchBook(keyword);
        
        System.out.print("\nEnter title of book to check out: ");
        String titleToBorrow = sc.nextLine(); // Changed to nextLine()
        
        try {
            withdrawBook(titleToBorrow);
        } catch (BookNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUpdated Library Status:");
        displayBooks();
        
        sc.close();
    }
    
    public static void displayBooks() {
        for(int i = 0; i < titles.length; i++) {
            System.out.printf("Title: %-18s | Author: %-20s | Status: %s%n", 
                titles[i], authors[i], (isAvailable[i] ? "Available" : "Checked Out"));
        }
    }
    
    public static void withdrawBook(String title) throws BookNotAvailableException {
        for(int i = 0; i < titles.length; i++) {
            if(titles[i].equalsIgnoreCase(title)) {
                if(!isAvailable[i]) {
                    throw new BookNotAvailableException("The book '" + title + "' is already checked out!");
                }
                isAvailable[i] = false;
                System.out.println("Success! You have checked out: " + titles[i]);
                return; // Exit method after finding and updating the book
            }
        }
        // If the loop finishes without returning, the book wasn't found
        System.out.println("Book '" + title + "' not found in our catalog.");
    }
    
    public static void searchBook(String keyword) {
        boolean found = false;
        System.out.println("Search Results:");
        for (int i : bookList) {
            if (titles[i].toLowerCase().contains(keyword.toLowerCase())) {
                found = true;
                System.out.println("-> Found: " + titles[i] + " by " + authors[i]);
            }
        }
        if (!found) {
            System.out.println("No books found matching: " + keyword);
        }
    }
}
