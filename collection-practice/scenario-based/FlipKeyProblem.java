import java.util.*;
public class FlipKeyProblem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String: ");
		String input = sc.nextLine();
		if((input.length() < 6)) {
			System.out.println(" ");
			return;
		}
		input = input.toLowerCase();
		for(int i = 0;i < input.length();i++) {
			if(!(input.charAt(i)>=97 && input.charAt(i)<=122)) {
				System.out.println(" ");
				return;
			}
		}
		StringBuilder output = new StringBuilder();
		for(int i = 0;i < input.length();i++) {
			char ch = input.charAt(i);
			if(ch%2!=0) {
				output.append(ch);
			}
		}
		output = output.reverse();
		String result = "";
		for(int i = 0;i < output.length();i++) {
			char ch = output.charAt(i);
			if(i%2 == 0) {
				result += (char)(ch-32);
			}else {
				result += ch;
			}
		}
		System.out.println("Generated Key is: "+result);
	}

}
