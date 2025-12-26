
import java.util.*;
public class RemoveSpecificChar {
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter a string");
	    String st=sc.next();
	    st=st.toLowerCase();
	    System.out.println("enter a character");
	    String cc=sc.next();
	    char c=cc.charAt(0);
	    
        String result="";
	    for(int i=0;i<st.length();i++)
	    {
	        char ch=st.charAt(i);
	        if(ch!=c)
	        {
	            result+=ch;
	        }
	        
	}
	System.out.println("after removing all occurance the string is = "+result);
}
}