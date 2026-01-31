import java.util.*;
public class LexicalTwistProblem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Word 1: ");
		String word1 = sc.nextLine();
		
		if(word1.contains(" ")) {
			System.out.println(word1+" is invalid word.");
			return;
		}
		
		System.out.println("Enter Word 2: ");
		String word2 = sc.nextLine();
		
		if(word2.contains(" ")) {
			System.out.println(word2+" is invalid word.");
			return;
		}
		
		StringBuilder input = new StringBuilder(word1);
		String reverseWord = input.reverse().toString();
		
		if(reverseWord.equalsIgnoreCase(word2)) {
			String output = reverseWord.toLowerCase().replaceAll("[aeiou]", "@");
			System.out.println(output);
		} else {
			String combinedWord = (word1+word2).toUpperCase();
			int vowelsCount = 0;
			int consonantCount = 0;
			String vowels = "AEIOU";
			
			for(char ch : combinedWord.toCharArray()) {
				if(ch >= 65 && ch <= 97) {
					if(vowels.indexOf(ch)!= -1) {
						vowelsCount++;
					}else {
						consonantCount++;
					}
				}
			}
			if (vowelsCount > consonantCount) {
			    printFirstTwo(combinedWord, true);
			} else if (consonantCount > vowelsCount) {
			    printFirstTwo(combinedWord, false);
			} else {
			    System.out.println("Vowels and consonants are equal");
			}
		}
	}
	
	public static void printFirstTwo(String str, boolean wantVowel) {
	    int count = 0;
	    String printed = "";

	    for (char ch : str.toCharArray()) {
	        boolean isVowel = "AEIOU".indexOf(ch) != -1;

	        if ((wantVowel && isVowel) || (!wantVowel && !isVowel)) {
	            if (printed.indexOf(ch) == -1) {
	                System.out.print(ch);
	                printed += ch;
	                count++;
	            }
	        }

	        if (count == 2)
	            break;
	    }
	}

}
