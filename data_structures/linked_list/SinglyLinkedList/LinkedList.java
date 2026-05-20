package data_structures.linked_list.SinglyLinkedList;

public class LinkedList {
    Node head;

    public void insertAtStart(int data) {

        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
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
