
import java.util.*;
public class calc_SI 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input principal , rate and time");
		double principal=sc.nextInt();
		double rate=sc.nextInt();
		double time=sc.nextInt();
		double SI=(principal*rate*time)/100;
		System.out.println("Simple Interest is ="+ SI);
	}
}