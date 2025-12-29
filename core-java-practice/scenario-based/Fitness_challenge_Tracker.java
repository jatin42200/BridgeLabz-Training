
import java.util.*;
public class Fitness_challenge_Tracker
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		 int[]pushUpperDay=new int[7];
		 System.out.println("<----welome to sandeep fitness score----->");
		 System.out.println("***Enter 0 for rest days***");
		 
		 //here we input pushups as per day
		 for(int i=0;i<7;i++)
		 {
		     System.out.print(days[i]+":- Enter pushup count of day "+(i+1)+" --->");
		     pushUpperDay[i]=sc.nextInt();
		 }
		 System.out.println("*****************weekly review****************");
		 int totalPushUp=0;
		 int totalRestDays=0;
		 int totalworkoutDays=0;
		 int idx=0;
		 for(int count=0;count<7;count++)
		 {
		     if(pushUpperDay[idx]==0)
		     {
		         System.out.println(days[idx] + ": REST DAY ");
		         totalRestDays++;
		         idx++;
		         continue;
		     }
		     totalPushUp=totalPushUp+pushUpperDay[idx];
		     totalworkoutDays++;
		     idx++;
		     
		     
		 }
		 
		 
// 		 here we print all STATISTICS
		 
		   
        System.out.println("\n<--------STATISTICS-------->");
        System.out.println("Total Push-ups: " + totalPushUp);
        System.out.println("Workout Days: " + totalworkoutDays);
        System.out.println("Rest Days: " + totalRestDays);
        
        
        if (totalworkoutDays > 0) { 
            double average = (double)  totalPushUp / totalworkoutDays;
            System.out.printf("Average Push-ups per Workout Day: %.2f\n", average);
        } else {
            System.out.println("No workouts this week! Time to get moving! ");
        }
		 
		 
	}
}
