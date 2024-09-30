package org.example;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    //creating start8ng linked list
    public Node createLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    //print out linked list
    public void traverseLinkedList(){
        if (head == null) {
            System.out.println("Linked list does not exist");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print("\n");
    }

    //add new node in linked list
    public void insertInLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;

        if (head == null){
            createLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            tail.next = node;
            node.next = null;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }


    //delete linked list
    public void deleteNode (int location) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (location == 0) {
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
        }
        else if (location >= size - 1) {
            Node temporaryNode = head;
            for (int i = 0; i < size - 2; i++) {
                temporaryNode = temporaryNode.next;
            }
            if (temporaryNode == head) {
                head = tail = null;
                size = 0;
            }
            else {
                temporaryNode.next = null;
                tail = temporaryNode;
                size--;
            }
        }
        else {
            Node temporaryNode = head;
            for (int i = 0; i < location - 1; i++) {
                temporaryNode = temporaryNode.next;
            }
            temporaryNode.next = temporaryNode.next.next;
            size--;
        }

    }
}
