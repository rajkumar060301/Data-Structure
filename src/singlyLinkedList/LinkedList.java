package singlyLinkedList;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 18 version
 * Date: 20-May-22
 */

// Make a linked list class
public class LinkedList {
    private Node head;

    public static void main(String[] args) {
        LinkedList sll = new LinkedList();
        // Insert the Element in linked list
        sll.head = new Node(10);
        Node secondNode = new Node(35);
        Node thirdNode = new Node(87);
        Node forthNode = new Node(68);
        sll.head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        sll.display();
        System.out.println("Length: " + sll.length());

    }

    // Print the element of linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");

    }

    public int length() {
        if (head == null) {
            return 0;
        }
        Node current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

}
