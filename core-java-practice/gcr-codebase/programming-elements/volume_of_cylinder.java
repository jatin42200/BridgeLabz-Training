
import java.util.*;
public class volume_of_cylinder {
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input height and radius");
		double height=sc.nextInt();
		double radius=sc.nextInt();
		double volume=3.14*radius*radius*height;
		System.out.println("volume of the cylender is ="+ volume);
	}
}
