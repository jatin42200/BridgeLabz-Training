
public class SpringSeason {

    // Method to check Spring Season
    public static boolean isSpringSeason(int month, int day) {
       if(month==3&&day>=20)
       {
        return true;
       }
       else if((month == 4 || month == 5) )
       {
        return true;
       }
       else if( (month == 6 && day <= 20))
       {
        return true;
       }
       else
       {
         return false;
       }
    }

    public static void main(String[] args) {

        // Taking input from command line
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check spring season
        if (isSpringSeason(month, day)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}