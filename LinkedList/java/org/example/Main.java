package org.example;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.createLinkedList(10);
        System.out.println("Linked List start:");
        list.traverseLinkedList();

        //add new ndoes
        list.insertInLinkedList(20, 1);
        list.insertInLinkedList(30, 2);
        list.insertInLinkedList(40, 0);
        list.insertInLinkedList(25, 2);
        list.insertInLinkedList(90, 0);
        System.out.println("Linked List after adding new nodes:");
        list.traverseLinkedList();

        //delete first node
        list.deleteNode(0);
        System.out.println("Linked List after deleting the first node:");
        list.traverseLinkedList();

        //delete last node
        list.deleteNode(list.size - 1);
        System.out.println("Linked List after deleting the last node:");
        list.traverseLinkedList();

        //delete a node in the middle
        list.deleteNode(1);
        System.out.println("Linked List after deleting node at index 1:");
        list.traverseLinkedList();
    }
}
