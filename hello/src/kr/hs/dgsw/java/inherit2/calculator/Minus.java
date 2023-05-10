package kr.hs.dgsw.java.inherit2.calculator;

public class Minus extends Calculator {

    @Override
    public int calculate() {
        return op1 - op2;
    }

    @Override
    public void printResult() {
        System.out.printf("%d - %d = %d\n", op1, op2, calculate());
    }

    public static void main(String[] args) {

        Calculator calculator = new Minus();
        calculator.execute();

    }

}
