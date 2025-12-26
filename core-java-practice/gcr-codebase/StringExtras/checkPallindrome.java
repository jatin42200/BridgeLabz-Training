import java.util.*;
public class checkPallindrome
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		st=st.toLowerCase();
		String duplicate=st;
		String result="";
		for(int i=st.length()-1;i>=0;i--)
		{
		    result=result+st.charAt(i);
		}
	    if(result.equals(duplicate))
	    {
	        System.out.println("String is pallindrome");
	    }
	    else{
	        System.out.println("String is not pallindrome");

	    }
	}
}
