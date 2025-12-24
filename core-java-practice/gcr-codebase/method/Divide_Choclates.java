
import java.util.*;
public class Divide_Choclates {
    public static int[] findRemainderAndQuotient(int number, int divisor) 
    {
       int distributed_chocklate = number/divisor;
       int remaing_chocklate=number%divisor;
       return new int[]{distributed_chocklate,remaing_chocklate};
    }
public static void main(String [] args)
{
    Scanner sc=new Scanner(System.in);
    //here we take input
    int number=sc.nextInt();
    int divisor=sc.nextInt();
    int[]ans=findRemainderAndQuotient(number, divisor); 
    System.out.print("no. of chocklate each child is received = "+ans[1]+"no of remaining chocklate "+ans[2]);
}
    
}
