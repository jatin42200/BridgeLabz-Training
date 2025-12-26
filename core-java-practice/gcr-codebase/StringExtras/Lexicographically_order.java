
import java.util.*;
public class Lexicographically_order
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String st1=sc.next();
	    st1=st1.toLowerCase();
	    String st2=sc.next();
	    st2=st2.toLowerCase();//here we convert given string into lower case
	    int l=Math.max(st1.length(),st2.length());
	    for(int i=0;i<l;i++)
	    {
	        char ch1=st1.charAt(i);
	        char ch2=st2.charAt(i);
	        if(ch1!=ch2)
	        {
	            int j=ch1;
	            int k=ch2;
	            if(j>k)
	            {
	                System.out.println(st2+" comes before "+st1 +" in lexicographical order");
	                return;
	            }
	            else
	            {
	                System.out.println(st1+" comes before "+st2 +" in lexicographical order");
	                return;
	            }
	        }
	    }
	
	}
}