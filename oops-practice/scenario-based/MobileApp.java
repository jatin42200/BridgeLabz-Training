import java.util.*;

class Contact {
    String name;
    String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + " | Phone: " + phoneNumber;
    }
}

class InvalidPhoneNumberException extends Exception {
    InvalidPhoneNumberException(String msg) {
        super(msg);
    }
}

class ContactOrganizer {
    ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(String name, String number) throws InvalidPhoneNumberException {
        // 1. Validation Logic
        if (number == null || number.length() != 10 || !number.matches("\\d+")) {
            throw new InvalidPhoneNumberException("Error: [" + number + "] is invalid. Must be exactly 10 digits.");
        }

        // 2. Duplicate Check
        for (Contact c : contacts) {
            if (c.phoneNumber.equals(number)) {
                System.out.println("Wait! Number " + number + " is already saved for " + c.name);
                return;
            }
        }

        contacts.add(new Contact(name, number));
        System.out.println("Contact added: " + name);
    }

    public void deleteContact(String number) {
        // Using removeIf is the safest and shortest way to delete from a list in Java
        boolean removed = contacts.removeIf(c -> c.phoneNumber.equals(number));
        
        if (removed) {
            System.out.println("Contact with number " + number + " deleted successfully.");
        } else {
            System.out.println("Delete failed: Number " + number + " not found.");
        }
    }

    public void searchContact(String number) {
        for (Contact c : contacts) {
            if (c.phoneNumber.equals(number)) {
                System.out.println("Found: " + c);
                return;
            }
        }
        System.out.println("Search Result: No contact found for " + number);
    }

    public void displayAll() {
        System.out.println("\n--- Contact List (" + contacts.size() + ") ---");
        if (contacts.isEmpty()) System.out.println("No contacts saved.");
        for (Contact c : contacts) System.out.println(c);
        System.out.println("--------------------------");
    }
}

public class MobileApp {
    public static void main(String[] args) {
        ContactOrganizer organizer = new ContactOrganizer();

        // Adding contacts with individual try-catches allows the valid ones to succeed 
        // even if one fails
        try { organizer.addContact("Harsh", "9876543210"); } catch (Exception e) { System.out.println(e.getMessage()); }
        try { organizer.addContact("Ankit", "9876543210"); } catch (Exception e) { System.out.println(e.getMessage()); }
        try { organizer.addContact("Rahul", "12345"); }      catch (Exception e) { System.out.println(e.getMessage()); }
        try { organizer.addContact("Suresh", "1122334455");} catch (Exception e) { System.out.println(e.getMessage()); }

        organizer.displayAll();

        organizer.searchContact("9876543210");
        organizer.deleteContact("9876543210");
        
        organizer.displayAll();
    }
}