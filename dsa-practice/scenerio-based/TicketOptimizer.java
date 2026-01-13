import java.util.Arrays;

// 1. Ticket Model
class Ticket {
    String seatNumber;
    double price;

    public Ticket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[" + seatNumber + ": ₹" + price + "]";
    }
}

// 2. Quick Sort Implementation
class EventManager {
    
    public void sortTickets(Ticket[] tickets, int low, int high) {
        if (low < high) {
            // Partitioning index
            int pi = partition(tickets, low, high);

            // Recursive calls for left and right halves
            sortTickets(tickets, low, pi - 1);
            sortTickets(tickets, pi + 1, high);
        }
    }

    private int partition(Ticket[] tickets, int low, int high) {
        // Pivot element (Choosing the last element)
        double pivot = tickets[high].price;
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current ticket price is smaller than or equal to pivot
            if (tickets[j].price <= pivot) {
                i++;
                // Swap tickets[i] and tickets[j]
                Ticket temp = tickets[i];
                tickets[i] = tickets[j];
                tickets[j] = temp;
            }
        }

        // Swap the pivot ticket with the ticket at i+1
        Ticket temp = tickets[i + 1];
        tickets[i + 1] = tickets[high];
        tickets[high] = temp;

        return i + 1;
    }
}

// 3. Main Execution Class
public class TicketOptimizer {
    public static void main(String[] args) {
        // Simulating unsorted ticket prices
        Ticket[] tickets = {
            new Ticket("S1", 1500.0),
            new Ticket("S2", 800.0),
            new Ticket("S3", 3500.0),
            new Ticket("S4", 1200.0),
            new Ticket("S5", 500.0),
            new Ticket("S6", 2200.0)
        };

        System.out.println("--- Before Sorting (Unsorted Prices) ---");
        System.out.println(Arrays.toString(tickets));

        // Applying Quick Sort
        EventManager manager = new EventManager();
        manager.sortTickets(tickets, 0, tickets.length - 1);

        System.out.println("\n--- After Sorting (Cheapest First) ---");
        for (Ticket t : tickets) {
            System.out.println(t);
        }
    }
}