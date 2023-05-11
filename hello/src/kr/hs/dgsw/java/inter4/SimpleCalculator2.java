package kr.hs.dgsw.java.inter4;

import java.util.Scanner;

public class SimpleCalculator2 {

    private final Scanner scanner = new Scanner(System.in);

    private int op1;

    private int op2;

    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public void execute() {
        while (true) {

            inputOperands();

            if (isTerminatedCondition()) {
                break;
            }

            int result = calculator.calculate(op1, op2);

            printResult(result);

        }
        scanner.close();
    }


    public void inputOperands() {
        System.out.println("두 개의 정수를 입력하세요.");
        op1 = scanner.nextInt();
        op2 = scanner.nextInt();
    }

    public void printResult(int result) {
        System.out.printf("%d %s %d = %d\n",
                op1,
                calculator.getOperator(),
                op2,
                result);
    }

    public boolean isTerminatedCondition() {
        return (op1 == 0 && op2 == 0);
    }

    public static void main(String[] args) {
        SimpleCalculator2 calculator2 = new SimpleCalculator2();
        calculator2.setCalculator(new Adder());
        calculator2.execute();

    }

}
