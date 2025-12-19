public class SpringSeason {
    public static void main(String[] args) {
        //here we take input 
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        if ((month == 3 && day >= 20)||(month == 4 || month == 5)||(month == 6 && day <= 20)) 
            {
            System.out.println("Its a Spring Season");
        } 
        else 
            {
            System.out.println("Its Not a Spring Season");
        }
    }
}