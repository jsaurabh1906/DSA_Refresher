package data_structures.linked_list.SinglyLinkedList;

public class SLLMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtStart(10);
        list.insertAtStart(20);
        list.insertAtEnd(30);
        list.insertAtPosition(1, 25);
        list.display();

        list.deleteAtStart();
        list.display();
    }
}
