package com.java.codeinterview.linkedlist;

public class SinglyLinkedList {

    private Node head;
    private int size;

    static class Node {
        private int data;
        private Node next;

        private Node(int data){
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    public SinglyLinkedList(){
        this.head = null;
        this.size = 0;
    }

    @Override
    public String toString() {
        return "SinglyLinkedList{" +
                "head=" + head +
                ", size=" + size +
                '}';
    }

    public void insertAtBeginning(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
        size ++;
    }

    //1->3->4->5->null
    public void insertAtEnd(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = node;
        size ++;
    }

    public void insertAtPosition(int data, int index){
        if(index < 0 || index > size){
            throw new IllegalStateException(String.format("Data: % dan't be inserted at index: %d", data, index));
        }
        if(index == 0){
            insertAtBeginning(data);
        } else {
            Node current = head;
            int count = 0;
            Node node = new Node(data);
            while (count < index - 1){
                count ++;
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
        }
        size ++;
    }

    public Node deleteFromBeginning(){
        if(size == 0){
            return null;
        }
        Node current = head;
        head = head.next;
        current.next = null;
        size --;
        return current;
    }

    public Node deleteFromEnd(){
        if(size == 0){
            return null;
        }
        Node current = head;
        if(head.next == null){
            head = null;
        } else {
            Node previous = null;
            while(current.next != null){
                previous = current;
                current = current.next;
            }
            previous.next = null;
        }
        size--;
        return current;
    }

    public void display(){
        Node current = head;
        while (current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public int getSize(){
        return size;
    }
}
