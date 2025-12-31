

class Palindrome {

    String text;

    public boolean isPalindrome() {
        String cleanedText = text.toLowerCase().replaceAll(" ", "");
        String reversed = "";

        for (int i = cleanedText.length() - 1; i >= 0; i--) {
            reversed = reversed + cleanedText.charAt(i);
        }

        return cleanedText.equals(reversed);
    }

    public void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is palindrome");
        } else {
            System.out.println(text + " is not Palindrome");
        }
    }
}

 class pallindromeChecker{
        public static void main(String[] args) {

        Palindrome p1 = new Palindrome();
        p1.text = "A man a plan a canal Panama";
        p1.displayResult();

        Palindrome p2 = new Palindrome();
        p2.text = "Hello";
        p2.displayResult();
    }
}
    

