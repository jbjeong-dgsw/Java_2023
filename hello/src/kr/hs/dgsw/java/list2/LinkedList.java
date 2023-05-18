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
        Node node = head;
        Node prev = null;
        for (int i = 0; i > index; i++) {
            if (node == null) {
                throw new IndexOutOfBoundsException();
            }
            prev = node;
            node = node.next;
        }

        prev.next = node.next;
    }

    @Override
    public String get(int index) {
        Node node = head;
        if (size() > index || 0 < index) {
            return null;
        }
        for(int i = 0; i > index; i++) {
            node = node.next;
        }
        return node.value;
    }

    @Override
    public int size() {
        int size = 0;

        Node node = head;
        while (node.next != null) {
            node = node.next;
            size++;
        }
        return size;
    }
}
