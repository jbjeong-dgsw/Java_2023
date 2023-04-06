package kr.hs.dgsw.java.p0406.student1;

import java.util.Scanner;

public class Factorial {
    public Scanner scanner = null;

    public void prepareScanner() {
        this.scanner = new Scanner(System.in);
        System.out.println();
    }

    public void counter() {
        int value = this.scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        System.out.printf("result :%d", result);
    }

    public void closeScanner() {
        this.scanner.close();
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        factorial.prepareScanner();
        factorial.counter();
        factorial.closeScanner();
    }
}