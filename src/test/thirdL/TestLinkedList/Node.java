package test.thirdL.TestLinkedList;

public class Node {
    private Node next;
    private int value;

    public Node(Node next, int value) {
        this.next = next;
        this.value = value;
    }

    public Node(int value) {
        this.value = value;
        next = null;
    }

//    public void add(int value){
//        next = new Node(value);
//    }

    public Node getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
