
import java.util.*;
public class ApplyToggleCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String st=sc.nextLine();
		String result="";
		for(int i=0;i<st.length();i++)
		{
		    char ch=st.charAt(i);
		    if(ch>=65&&ch<=90)
		    {
		        int j=ch+32;//here we transfer uppercase into lowercase
		        ch=(char)j;
		        result=result+ch;
		    }
		    else if(ch>=97&&ch<=122)
		    {
		        int j=ch-32;//here we transfer lowecase into uppercase
		        ch=(char)j;
		        result=result+ch;//here we add toggle character
		    }
		    else{
		        result=result+ch;
		    }
		}
		System.out.println("toggle string is = "+result);//print output
	}
}