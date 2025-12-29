
import java.util.*;
public class LibraryFineCalc {
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("------------------------------------");
		System.out.println("welcome to the library calculator");
		System.out.println("------------------------------------\n");
		int totalfine=0;
		
		for(int i=1;i<=5;i++)
		{
		    System.out.print("Enter the name of book no."+i+" : ");
		    String book=sc.nextLine();
		    System.out.print("Enter no. of days for which book issued : ");
		    int dueday=sc.nextInt();
		    System.out.print("Enter how many days it took to return the book : ");
		    int returnday=sc.nextInt();
		    sc.nextLine();
		    int late=returnday-dueday;
		    if(late>0)
		    {
		        System.out.println("Alert!!! you are late ");
		        System.out.println("delay for : "+late+" days");
		        System.out.println("Fine for this book : Rs."+late*5);
		        System.out.println("------------------------------------------------------------------------------------- ");

		        totalfine=totalfine+late*5;
		    }
		    else
		    {
		        System.out.println("Status is good");
		        System.out.println("------------------------------------------------------------------------------------- ");

		    }
		    
		}
		        
        System.out.println("---------------------");
        System.out.println("TOTAL FINE: Rs." + totalfine);
        System.out.println("----------------------");
		
	}
}