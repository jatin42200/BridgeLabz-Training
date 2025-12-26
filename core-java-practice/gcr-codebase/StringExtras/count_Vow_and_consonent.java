
import java.util.*;
public class count_Vow_and_consonent {
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		String s=st.toLowerCase();
		int Vcount=0;
		int Ccount=0;
		for(int i=0;i<s.length();i++)
		{
		    char ch=s.charAt(i);
		    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		    {
		      Vcount++;  
		    }
		    else
		    {
		        Ccount++;
		    }
		}
		System.out.println("total vowel is = "+Vcount);
		System.out.println("total consonent is ="+Ccount);

	}
}
