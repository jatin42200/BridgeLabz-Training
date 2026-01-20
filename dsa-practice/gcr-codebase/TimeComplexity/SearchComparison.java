

public class SearchComparison {

    // Linear Search: Ek-ek karke check karna
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    // Binary Search: Divide and Conquer (Sorted data chahiye)
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        // Dataset size (Example: 1 Lakh elements)
        int n = 100000;
        int[] data = new int[n];
        for (int i = 0; i < n; i++) data[i] = i; // Sorted data

        int target = 99999; // Last element search kar rahe hain (Worst Case)

        // Linear Search Time Calculation
        long startTime = System.nanoTime();
        linearSearch(data, target);
        long endTime = System.nanoTime();
        System.out.println("Linear Search Time: " + (endTime - startTime) / 1000000.0 + " ms");

        // Binary Search Time Calculation
        startTime = System.nanoTime();
        binarySearch(data, target);
        endTime = System.nanoTime();
        System.out.println("Binary Search Time: " + (endTime - startTime) / 1000000.0 + " ms");
    }
}
