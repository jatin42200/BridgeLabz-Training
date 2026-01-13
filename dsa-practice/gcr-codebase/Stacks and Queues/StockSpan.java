import java.util.Stack;
import java.util.Arrays;

public class StockSpan {

    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> s = new Stack<>();

        // Pehle din ka logic
        s.push(0);
        span[0] = 1;

        for (int i = 1; i < n; i++) {
            // Step 1: Choti prices wale indices ko hatao
            while (!s.isEmpty() && prices[s.peek()] <= prices[i]) {
                s.pop();
            }

            // Step 2: Span calculate karo
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - s.peek();
            }

            // Step 3: Current index push karo
            s.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] result = calculateSpan(prices);

        System.out.println("Prices: " + Arrays.toString(prices));
        System.out.println("Span:   " + Arrays.toString(result));
    }
}