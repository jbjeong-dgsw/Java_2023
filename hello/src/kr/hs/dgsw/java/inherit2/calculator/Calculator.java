package kr.hs.dgsw.java.inherit2.calculator;

import java.util.Scanner;

public abstract class Calculator {
    protected final Scanner scanner = new Scanner(System.in);

    protected int op1;

    protected int op2;

    public void execute() {
        while (true) {
            input();

            if (op1 == 0 && op2 == 0) {
                break;
            }

            printResult();
        }

        scanner.close();
        System.out.println("프로그램을 종료합니다.");
    }

    public void input() {
        System.out.println("두 개의 정수를 입력하세요.");
        op1 = scanner.nextInt();
        op2 = scanner.nextInt();
    }

    public abstract int calculate();

    public void printResult() {
        System.out.printf("%d + %d = %d\n", op1, op2, calculate());
    }

}
