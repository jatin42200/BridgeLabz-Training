import java.util.*;
public class ReverseString
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		st=st.toLowerCase();
		String result="";
		for(int i=st.length()-1;i>=0;i--)
		{
		    result=result+st.charAt(i);
		}
		System.out.println("Reverse String is = "+result);
	}
}
