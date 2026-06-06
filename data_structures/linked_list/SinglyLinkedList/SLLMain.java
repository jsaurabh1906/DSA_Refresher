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

        list.deleteAtEnd();
        list.display();
        list.insertAtStart(5);
        list.insertAtEnd(35);
        list.insertAtEnd(45);
        list.display();

        list.deleteAtPosition(2);
        list.display();

        list.deleteByValue(45);
        list.display();

        System.out.println("Value 25 found: " + list.search(25)); // true
    }
}
