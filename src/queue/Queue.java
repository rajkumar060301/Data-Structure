package queue;
/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 19 version
 * Date: 08-Jan-23
 */
public class Queue {
    private ListNode front;
    private ListNode rear;
    private int length;

    public Queue() {
        this.front = null;
        this.rear = null;
        this.length = 0;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(54);
        queue.enqueue(79);
        queue.enqueue(37);
        queue.enqueue(46);
        queue.printQueue();


    }

    public void enqueue(int data) {
        ListNode temp = new ListNode(data);
        if (isEmpty()) {
            front = temp;
        } else {
            rear.next = temp;
        }
        rear = temp;
        length++;
    }


    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }


    public void printQueue() {
        if (isEmpty()) {
            return;
        }
        ListNode current = front;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;

        }
    }

}
