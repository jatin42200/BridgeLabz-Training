class InvalidNameException extends Exception {

    public InvalidNameException(String message) {
        super(message);
    }
}


public class Main {

    public static boolean validateName(String name) {

        // Name null ya empty nahi hona chahiye
        // Aur sirf alphabets hone chahiye
        return name != null && name.matches("[a-zA-Z]+");
    }


    public static void main(String[] args) {

        String name = "Goldy";

        try {

            if (validateName(name)) {
                System.out.println("Valid");
            } else {
                throw new InvalidNameException("Name is invalid");
            }

        } catch (InvalidNameException e) {
            System.out.println(e.getMessage());
        }
    }
}