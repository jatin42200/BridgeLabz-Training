import java.util.*;

class MyQueue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        if (s2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        return s2.pop();
    }
}

public class ConvertQueue {
    public static void main(String[] args) {
        MyQueue mq = new MyQueue();

        mq.push(10);
        mq.push(20);
        mq.push(30);
        mq.push(40);
        mq.push(50);

        System.out.println(mq.pop()); // 10
        System.out.println(mq.pop()); // 20
        System.out.println(mq.pop()); // 30
    }
}