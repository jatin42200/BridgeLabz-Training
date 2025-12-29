
import java.util.*;
public class MovieTicketApp {{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Welcome's to jatin's movie booking app\n");
		
		boolean process=true;
		while(process)
		{
		    System.out.print("Enter your name brother : ");
		    String customer=sc.nextLine();
		     // Movie selection
            System.out.println("\n1. Action - Rs.250");
            System.out.println("2. Comedy - Rs.200");
            System.out.println("3. Horror - Rs.220");
            System.out.print("enter your movie : ");
            int movie=sc.nextInt();
            
            double moviePrice = 0;
            String movieName = "";
            
            switch(movie)
            {
                case 1: movieName= "Action";
                moviePrice=250;
                break;
                case 2: movieName= "Comedy";
                moviePrice=200;
                break;
                case 3: movieName= "Horror";
                moviePrice=220;
                break;
                default : moviePrice = 200;
                    movieName = "Comedy";
            }
             // Seat selection
            System.out.println("\n1. Gold - Rs.150");
            System.out.println("2. Silver - Rs.50");
            System.out.println("Select seat type");
            int seatNo=sc.nextInt();
            String seatType="";
            double Seatprice=0.0;
            switch(seatNo)
            {
                case 1:seatType="Gold";
                 Seatprice=150.0;
                 break;
                 case 2:seatType="Silver";
                 Seatprice=150.0;
                 break;
                 default:seatType="Gold";
                 Seatprice=150.0;
                
            }
           
            // Tickets
            System.out.print("Number of tickets: ");
            int tickets = sc.nextInt();
            
             // Snacks
            System.out.println("\n1. Popcorn - Rs.150");
            System.out.println("2. Nachos - Rs.180");
            System.out.println("3. No Snacks");
            System.out.print("Select snacks: ");
            int snacks = sc.nextInt();
            
            double snacksPrice = 0;
            String snacksName = "";
            
            switch (snacks) {
                case 1:
                    snacksPrice = 150;
                    snacksName = "Popcorn";
                    break;
                case 2:
                    snacksPrice = 180;
                    snacksName = "Nachos";
                    break;
                default:
                    snacksPrice = 0;
                    snacksName = "None";
            }
            // Calculate
            double total = (moviePrice + Seatprice) * tickets;
            total += snacksPrice * tickets;
            
            
            // dISPLAY
            System.out.println("\n<<<<<------------TOTAL SUMMARY---------------->>>>>>");
            System.out.println("Name    : " + customer);
            System.out.println("Movie   : " + movieName);
            System.out.println("Seat    : " + seatType);
            System.out.println("Tickets : " + tickets);
            System.out.println("Snacks  : " + snacksName);
            System.out.println("Total   : Rs." + total);
            System.out.println("--------------------------------------------------------\n");
            
		    System.out.print("If you want Another booking than select 1 otherwise select 0: ");
            int cont = sc.nextInt();
              if (cont != 1) {
                process = false;
            }
            System.out.println("\nThank you!baby!!!!");
		}
		
	}
}