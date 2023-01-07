package singlyLinkedList;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 19 version
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
        System.out.println("Print LinkedList");
        sll.display();
        System.out.println("Length: " + sll.length());

        // Add First node
        sll.insertFirst(20);
        sll.insertFirst(86);
        sll.insertFirst(87);
        sll.insertFirst(47);
        sll.insertFirst(86);
        System.out.println("Add first element");
        sll.display();

        // add last node
        sll.addLast(25);
        sll.addLast(10);
        sll.addLast(85);
        System.out.println("Add Last element");
        sll.display();

        //add given position
        sll.addGivenPosition(2, 12);
        System.out.println("Insert element at given position");
        sll.display();

        // Delete first element
        sll.deleteFirst();
        System.out.println("Delete first element");
        sll.display();

        // Delete Last node
        sll.deleteLast();
        System.out.println("Delete last node");
        sll.display();

        // delete at given position
        sll.deleteGivenPosition(2);
        System.out.println("Delete at given position");
        sll.display();

        // search element in linkedList
//        System.out.println("Searching Element");
        if (sll.searchElement(99)) {
            System.out.println("Element is founded");
        } else {
            System.out.println("Element is not found");
        }
        //reverse the linkedList
        System.out.println("Reverse the linkedList");
        Node reverseNode = sll.reverse(sll.head);
        sll.display();


    }

    // reverse linkedList
    public Node reverse(Node head) {
        if (head == null) {
            return head;
        }
        Node current = head;
        Node previous = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;

    }

    public boolean searchElement(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }


    // deleteGivenPosition of linkedList
    public void deleteGivenPosition(int pos) {
        if (pos == 1) {
            head = head.next;
        } else {
            Node previous = head;
            int count = 1;
            while (count < pos - 1) {
                previous = previous.next;
                count++;
            }
            Node current = previous.next;
            previous.next = current.next;
        }

    }

    // deleteLast element in linkedList
    public Node deleteLast() {
        if (head == null || head.next == null) {
            return head;
        }
        Node current = head;
        Node previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;

    }

    // addGivenPosition in linkedList
    private void addGivenPosition(int i, int new_data) {
        Node node = new Node(new_data);
        if (head == null) {
            node.next = head;
            head = node;
        } else {
            Node previous = head;
            int count = 1;
            while (count < i - 1) {
                previous = previous.next;
                count++;
            }
            Node current = previous.next;
            previous.next = node;
            node.next = current;
        }

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

    // find length of linkedList
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

    // addFirst element in linkedList
    public void insertFirst(int new_data) {
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        head = new_Node;
    }

    // deleteFirst element in linkedList
    public Node deleteFirst() {
//        Node newNode = new Node(element);
        if (head == null) {
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    // addLast element in linkedList
    public void addLast(int element) {
        Node new_Node = new Node(element);
        if (head == null) {
            head = new Node(element);
        } else {
            new_Node.next = null;
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_Node;
        }
    }

    // addAfterGivenNode in linkedList
    public void addAfterGivenNode(Node givenNode, int new_data) {
        Node new_node = new Node(new_data);
        if (givenNode == null) {
            System.out.println("null");
            return;
        } else {
            new_node.next = givenNode.next;
            givenNode.next = new_node;

        }

    }

    // create Node class with constructor
    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
}
