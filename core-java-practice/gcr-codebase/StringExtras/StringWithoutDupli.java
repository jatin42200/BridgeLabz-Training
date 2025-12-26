
import java.util.*;
public class StringWithoutDupli {
{
	public static void main(String[] args) {
	    boolean[]check=new boolean[256];
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		st=st.toLowerCase();
		String result="";
		for(int i=0;i<st.length();i++)
		{
		    char ch=st.charAt(i);
		    if(!check[ch])
		    {
		        result=result+ch;
		        check[ch]=true;
		    }
		}
		System.out.println("String withou duplicate character is = "+result);
	}
}