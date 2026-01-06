

public class InvoiceGenerator {

    public static void main(String[] args) {
        // Sample input with varying spaces and characters
        String input = "Logo Design - 3000 INR, Web Page - 4500 INR, App Icon - 1200 INR";
        
        String[] tasks = parseInvoice(input);
        int totalAmount = calculateTotal(tasks);
        
        System.out.println("=== INVOICE DETAILS ===");
        for (String task : tasks) {
            // trim() removes leading/trailing spaces for a cleaner output
            System.out.println("- " + task.trim());
        }
        
        System.out.println("-----------------------");
        System.out.println("Total Amount Due: " + totalAmount + " INR");
        System.out.println("=======================");
    }

    /**
     * Splits the input string into individual task strings.
     */
    public static String[] parseInvoice(String input) {
        if (input == null || input.isEmpty()) return new String[0];
        return input.split(",");
    }
    
    /**
     * Extracts digits from each task and sums them up.
     */
    public static int calculateTotal(String[] tasks) {
        int total = 0;
        for (String task : tasks) {
            try {
                // Split by hyphen to separate description from price
                String[] parts = task.split("-");
                
                if (parts.length >= 2) {
                    // Extract only numbers from the price part
                    String amountStr = parts[1].replaceAll("[^0-9]", "");
                    
                    if (!amountStr.isEmpty()) {
                        total += Integer.parseInt(amountStr);
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Warning: Could not parse amount in task: " + task);
            }
        }
        return total;
    }
}
