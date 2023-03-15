package kr.hs.dgsw.java;

public class Adder {

    int plus(int operand1, int operand2) {
        int sum = operand1 + operand2;

        return sum;
    }

    int plus(int operand1, int operand2, int operand3) {
        //int sum = operand1 + operand2 + operand3;
        int sum = plus(plus(operand1, operand2), operand3);

        return sum;
    }

    public static void main(String[] args) {
        Adder calc = new Adder();

        int result = calc.plus(456648, 125348);

        System.out.println(result);

    }

}
