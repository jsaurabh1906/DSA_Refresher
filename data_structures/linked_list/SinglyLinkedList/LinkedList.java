package data_structures.linked_list.SinglyLinkedList;

public class LinkedList {
    Node head;

    public void insertAtStart(int data) {

        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public void insertAtPosition(int position, int data) {
        Node newNode = new Node(data);

        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        int currentPosition = 0;

        while (current != null && currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }

        if (current == null) {
            System.out.println("Position out of bounds");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void deleteAtStart() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
    }

    public void deleteAtEnd() {
        // If the list is empty, do nothing
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // If the list has only one node, remove it
        if (head.next == null) {
            head = null;
            return;
        }

        // Traverse to the second last node in case of multiple nodes
        Node current = head;

        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
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
