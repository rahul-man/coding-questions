package com.java.codeinterview.linkedlist;

public class Test {

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.insertAtBeginning(10);
        linkedList.insertAtBeginning(20);
        linkedList.insertAtPosition(30, 1);
        linkedList.display();
        //System.out.println(linkedList.deleteFromBeginning());
        System.out.println(linkedList.deleteFromEnd());
        linkedList.display();
    }
}
