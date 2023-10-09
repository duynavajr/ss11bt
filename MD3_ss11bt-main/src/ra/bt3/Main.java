package ra.bt3;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);

        queue.dequeue();
        queue.displayQueue();
    }
}
