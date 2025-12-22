
public class Null_Pointer_Exception {

    // Generates NullPointerException
    public static void generateException() {
        String text = null;

        // This line will cause NullPointerException
        System.out.println("Length of text: " + text.length());
    }

    // Handles NullPointerException using try-catch
    public static void handleException() {
        String text = null;

        try {
            System.out.println("Length of text " + text.charAt(0));
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught ");
            System.out.println("Tried to access method on null object");
        }
    }

    public static void main(String[] args) {

        // here we call method that Generate the exception
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception occurred ");
        }

        //  here we Handle the exception safely
        System.out.println("Handling NullPointerException:");
        handleException();
    }
}
