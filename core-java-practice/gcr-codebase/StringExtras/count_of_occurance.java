
public class count_of_occurance {
    public static void main(String[] args) {
        String str = "abababa";
        String sub = "aba";

        int count = countOccurrences(str, sub);
        System.out.println("total Occurrences of this substring is = " + count);
    }

    public static int countOccurrences(String str, String sub) {
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index = index + sub.length(); // move ahead
        }
        return count;
    }
}
