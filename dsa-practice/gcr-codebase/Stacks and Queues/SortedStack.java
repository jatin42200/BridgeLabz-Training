
import java.util.Stack;

 class SortStack {

    // Function jo stack ko khali karta hai
    public void sortStack(Stack<Integer> s) {
        
        
       // Base case
        if (s.isEmpty()) {
            return;
        }

       //extract top element
        int temp = s.pop();

        // Baaki bache stack ke liye recursion call
        sortStack(s);

        // Jab stack sort ho jaye, tab temp ko sahi jagah insert karo
        sortedInsert(s, temp);
    }

    //  Function jo element ko sahi sorted position pe daalta hai
    public static void sortedInsert(Stack<Integer> s, int element) {
        // Agar stack khali hai ya element top se bada hai, toh push kar do
        if (s.isEmpty() || element > s.peek()) {
            s.push(element);
            return;
        }

        // Agar element chota hai, toh top ko nikaalo aur recursion call karo
        int temp = s.pop();
        sortedInsert(s, element);

        // Wapas aate waqt nikaala gaya top wapas daal do
        s.push(temp);
    }
}
class SortedStack
{
    public static void main(String[] args) {
        SortStack ss = new SortStack();
        Stack<Integer> s = new Stack<>();
        s.push(89);
        s.push(-52);
        s.push(18);
        s.push(114);
        s.push(-31);

        System.out.println("Stack before sorting: " + s);

        ss.sortStack(s);

        System.out.println("Stack after sorting: " + s);
    }
}