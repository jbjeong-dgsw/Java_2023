package kr.hs.dgsw.java.list2;

public class LinkedList implements List {
    private Node head;

    @Override
    public void add(String value) {
        Node node = new Node();
        node.value = value;

        if (head == null) {
            head = node;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
