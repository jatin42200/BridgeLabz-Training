
import java.util.*;
public class CelciusToFahr {
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input temperature in celcius");
		int temp=sc.nextInt();
		double fahr=(temp*9/5)+32;
		System.out.println("temperature in fahrenheit is ="+fahr);
	}
}
