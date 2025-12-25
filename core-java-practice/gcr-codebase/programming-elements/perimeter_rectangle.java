import java.util.*;
public class perimeter_rectangle
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input principal , rate and time");
		int length=sc.nextInt();
		int width=sc.nextInt();
		
		double perimeter=2*length*width;
		System.out.println("perimeter of a rectangle is ="+perimeter);
	}
}
