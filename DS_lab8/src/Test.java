public class Test {
    public static void main(String[] args) {
        LinkedQueue <Integer> q =new LinkedQueue<>();
        q.enqueue(11);
        q.enqueue(12);
        q.enqueue(13);
        while (!q.isEmpty()) {
            System.out.println(q.dequeue());
        }
    }
}
