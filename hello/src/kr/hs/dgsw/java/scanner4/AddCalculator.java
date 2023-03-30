package kr.hs.dgsw.java.scanner4;

import java.util.Scanner;

public class AddCalculator {
    private Scanner scanner;

    public void prepare() {
        this.scanner = new Scanner(System.in);
    }

    public void execute() {
        System.out.println("두 개의 정수를 입력하세요.");
        int value1 = this.scanner.nextInt();
        int value2 = this.scanner.nextInt();
        int result = execute(value1, value2);

        System.out.printf("%d + %d = %d\n", value1, value2, result);
    }

    public int execute(int value1, int value2) {
        return value1 + value2;
    }

    public void close() {
        this.scanner.close();
    }


    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        int result = value1 + value2;
        System.out.printf("%d + %d = %d\n", value1, value2, result);

         */

        AddCalculator calculator = new AddCalculator();
        calculator.prepare();
        calculator.execute();
        calculator.close();
    }
}
