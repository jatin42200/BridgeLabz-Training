
import java.util.*;
public class LongestWord {
{
	public static void main(String[] args) {
	    boolean[]check=new boolean[256];
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		st=st.toLowerCase()+' ';
		String LongestWord="";
		String current_word="";
		for(int i=0;i<st.length();i++)
		{
		    char ch=st.charAt(i);
		    if(ch!=' ')
		    {
		        current_word=current_word+ch;
		    }
            //here we calculate which is longest word in given string
		    else{
		        if(LongestWord.length()<current_word.length())
		        {
		            LongestWord=current_word;
		        }
		        current_word="";
		    }
		}
		System.out.println("longest word in a string is = "+LongestWord);
	}
}