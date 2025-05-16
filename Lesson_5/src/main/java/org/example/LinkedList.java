package org.example;

public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList(int value) {
        head = new Node(value);
    }

    public void add(int value) {
        if (tail == null) {
            head.next = new Node(value);
            tail = head.next;
        }
        else {
            tail.next = new Node(value);
            tail = tail.next;
        }
    }

    public void reverse() {

    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            next = null;
        }
    }
}
