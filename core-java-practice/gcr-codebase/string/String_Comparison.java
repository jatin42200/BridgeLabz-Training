
import java.util.Scanner;

public class String_Comparison {

    // here we compare two string using charAt method
    public static boolean compare_By_CharAt(String s1, String s2) {

        // here we check length of both string
        if (s1.length()!=s2.length()) {
            return false;
        }

        // here we compare string by using charAt method
        for (int i=0; i<s1.length(); i++) {
            if (s1.charAt(i)!=s2.charAt(i)) {
                return false;
            }
        }
        return true;//if all character is same in both string than it will return true
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // here we take input
        String str1=sc.next();//here we enter first string
        String str2=sc.next();//here we enter second string

        // Manual comparison
        boolean result_CharAt=compare_By_CharAt(str1, str2);

        // comparison by using equals method
        boolean result=str1.equals(str2);

        // here we display results
        System.out.println("result after using charAt method" + result_CharAt);
        System.out.println("Result after using equals function" + result);

        // Check if both results are same
        if (result_CharAt==result) {
            System.out.println("Both have same result ");
        } else {
            System.out.println("both have different results ");
        }
    }
}
