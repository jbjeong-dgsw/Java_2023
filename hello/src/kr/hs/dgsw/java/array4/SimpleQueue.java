package kr.hs.dgsw.java.array4;

import java.util.Scanner;

public class SimpleQueue<T> {
    private static final int SIZE = 3;

    private T[] array = (T[]) new Object[SIZE];

    private int front = 0;

    private int rear = 0;

    private boolean reverse = false;

    public void enqueue(T value) {
        if (isFull()) {
            throw new RuntimeException("Full");
        }

        array[front] = value;
        front = (front + 1) % SIZE;
        if (front == 0) {
            reverse = true;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Empty");
        }

        T value = array[rear];
        rear = (rear + 1) % SIZE;
        if (rear == 0) {
            reverse = false;
        }
        return value;
    }

    public boolean isEmpty() {
        return (size() == 0);
    }

    public boolean isFull() {
        return (size() >= SIZE);
    }

    public int size() {
        return reverse ? ((SIZE - rear) + front) : (front - rear);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SimpleQueue<String> queue = new SimpleQueue<>();

        String word = null;
        String command = null;
        while (true) {
            System.out.print("Command : ");
            command = scanner.next();
            if ("add".equals(command)) {
                if (queue.isFull()) {
                    System.out.println("Stack Full");
                    continue;
                } else {
                    word = scanner.next();
                    queue.enqueue(word);
                }

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
