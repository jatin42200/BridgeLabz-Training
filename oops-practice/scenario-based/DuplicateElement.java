import java.util.*;

public class DuplicateElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter " + size + " Elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Using Sets for faster lookup
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            // .add() returns false if the element is already present in the set
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicate Elements: ");
        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            System.out.println(duplicates);
        }
        
        sc.close();
    }
}