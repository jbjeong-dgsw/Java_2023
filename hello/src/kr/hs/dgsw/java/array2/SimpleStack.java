package kr.hs.dgsw.java.array2;

import java.util.Scanner;

public class SimpleStack {
    private static final int SIZE = 2;

    private String[] array = new String[SIZE];

    private int top = 0;

    void push(String value) {
        array[top] = value;
        top++;
    }

    String pop() {
        top--;
        return array[top];
    }

    boolean isEmpty() {
        return (top == 0);
    }

    boolean isFull() {
        return (top == SIZE);
    }

    int getSize() {
        return top;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = null;
        String data = null;
        SimpleStack stack = new SimpleStack();

        while (true) {
            System.out.print("Command : ");
            command = scanner.next();

            if ("push".equals(command)) {
                if (stack.isFull()) {
                    System.out.println("Stack Full");
                    continue;
                }
                data = scanner.next();
                stack.push(data);
            } else if ("pop".equals(command)) {
                if (stack.isEmpty()) {
                    System.out.println("Stack Empty");
                    continue;
                }
                data = stack.pop();
                System.out.println(data);
            } else if ("size".equals(command)) {
                int size = stack.getSize();
                System.out.println(size);
            } else if ("exit".equals(command)) {
                break;
            } else {
                System.out.println("멍충아!");
            }
        }

        scanner.close();
    }

}
