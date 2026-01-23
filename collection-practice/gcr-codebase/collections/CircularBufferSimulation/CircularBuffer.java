package CircularBufferSimulation;

public class CircularBuffer {
	int[] buffer;
    int size;
    int front = 0;
    int rear = 0;
    int count = 0;

    CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
    }

    public void insert(int value) {

        if (count == size) {
            front = (front + 1) % size;
            count--;
        }

        buffer[rear] = value;
        rear = (rear + 1) % size;
        count++;
    }

    public void display() {
        System.out.print("Buffer: [ ");
        int index = front;

        for (int i = 0; i < count; i++) {
            System.out.print(buffer[index] + " ");
            index = (index + 1) % size;
        }
        System.out.println("]");
    }
}
