package test.thirdL.TestLinkedList;

public class List1 {
    private Node head;
    private static int counter = 0;

    public List1() {
        head = null;
    }

    public void add(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
//            Node temp = new Node(value);
//            current.setNext(temp);

            current.setNext(new Node(value));
        }
    }

    public void print() {
        Node current = head;
        System.out.println(current.getValue());
        if (current.getNext() != null) {
            while ((current = current.getNext()) != null) {
//                current = current.getNext();
                System.out.println(current.getValue());
            }
        }
    }

}
