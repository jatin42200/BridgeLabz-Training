import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        String longestWord = "";

        for (String word : words) {

            if (word.length() % 2 == 0 &&
                word.length() > longestWord.length()) {

                longestWord = word;
            }
        }

        System.out.println(longestWord);
    }
}