package kr.hs.dgsw.java.list4;

public class MyLinkedList implements MyList {
    private Node head;

    public MyLinkedList() {
    }


    @Override
    public void add(String value) {
        Node node = new Node();
        node.setValue(value);

        Node prev = getLastNode();
        if (prev == null) {
            head = node;
        } else {
            prev.setNext(node);
        }
    }

    @Override
    public String get(int index) {
        Node node = head;

        for (int i = 0 ; i < index ; i++) {
            if (node == null) {
                throw new IndexOutOfBoundsException();
            }

            node = node.getNext();
        }

        return node.getValue();
    }

    @Override
    public int size() {
        Node node = head;

        int size = 0;
        while (node != null) {
            node = node.getNext();
            size++;
        }

        return size;
    }

    private Node getLastNode() {
        if (head == null) {
            return null;
        }

        Node node = head;
        while (true) {
            if (node.getNext() == null) {
                return node;
            }
            node = node.getNext();
        }
    }

    public static void main(String[] args) {
        MyList list = new MyLinkedList();

        list.add("Korea");
        list.add("USA");
        list.add("Japan");
        list.add("China");

        System.out.println(list.size());
        System.out.println(list.get(2));
        System.out.println(list.get(3));

    }
}
