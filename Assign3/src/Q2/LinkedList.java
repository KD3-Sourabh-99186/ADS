package Q2;

public class LinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    private Node head;

    public void insertSorted(int data) {
        Node newNode = new Node(data);

        if (head == null || data <= head.data) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null && current.next.data < data) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }
}
