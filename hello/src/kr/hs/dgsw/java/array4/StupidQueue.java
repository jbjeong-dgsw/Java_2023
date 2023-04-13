package kr.hs.dgsw.java.array4;

import java.util.Scanner;

public class StupidQueue {
    private static final int SIZE = 10;

    private String[] array = new String[SIZE];

    private int top = 0;

    public void enqueue(String value) {
        array[top] = value;
        top++;
    }

    public String dequeue() {
        String value = array[0];
        shift();
        top--;
        return value;
    }

    private void shift() {
        for (int i = 0 ; i < (top - 1) ; i++) {
            array[i] = array[i + 1];
        }
    }

    public boolean isEmpty() {
        return top <= 0;
    }

    public boolean isFull() {
        return top >= SIZE;
    }

    public int size() {
        return top;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StupidQueue queue = new StupidQueue();

        String word = null;
        String command = null;
        while (true) {
            command = scanner.next();
            if ("add".equals(command)) {
                if (queue.isFull()) {
                    System.out.println("Stack Full");
                    continue;
                }
                word = scanner.next();
                queue.enqueue(word);
            } else if ("get".equals(command)) {
                if (queue.isEmpty()) {
                    System.out.println("Stack Empty");
                    continue;
                }
                System.out.println(queue.dequeue());
            } else if ("size".equals(command)) {
                System.out.println(queue.size());
            } else if ("quit".equals(command)) {
                break;
            } else {
                System.out.println("Unknown command");
            }
        }

        scanner.close();
    }
}
