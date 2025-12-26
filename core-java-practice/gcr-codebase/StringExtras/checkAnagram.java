
import java.util.*;
public class checkAnagram {
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter string no.1");
	    String s1=sc.next();
	    System.out.println("enter string no.2");
	    String s2=sc.next();
	   if(s1.length()!=s2.length())
	   {
	       System.out.println("both string are not anagram");
	   }
	  else
	  {
	      char[] charArray1 = s1.toCharArray();
          char[] charArray2 = s2.toCharArray();
          Arrays.sort(charArray1);
          Arrays.sort(charArray2);
          if(Arrays.equals(charArray1,charArray2)==true)
          {
              System.out.println("both string is an anagram");
          }
          else{
              System.out.println("both string is not an anagram");
              
          }
	  }
}
}