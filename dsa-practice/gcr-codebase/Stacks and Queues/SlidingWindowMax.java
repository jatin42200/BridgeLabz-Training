import java.util.*;

public class SlidingWindowMax {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return new int[0];
        
        int[] result = new int[n - k + 1];
        int ri = 0; // result array ka index
        
        // Deque store karega array ke indices
        Deque<Integer> dq = new ArrayDeque<>();
        
        for (int i = 0; i < n; i++) {
            // 1. Khidki se bahar wale elements ko aage se hatao
            if (!dq.isEmpty() && dq.peek() == i - k) {
                dq.poll();
            }
            
            // 2. Chote elements ko piche se hatao (wo kisi kaam ke nahi)
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }
            
            // 3. Current element ka index add karo
            dq.offer(i);
            
            // 4. Jab pehli window puri ho jaye, tabse result store karna shuru karo
            if (i >= k - 1) {
                result[ri++] = nums[dq.peek()];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] res = maxSlidingWindow(arr, k);
        System.out.println("Max in each window: " + Arrays.toString(res));
    }
}