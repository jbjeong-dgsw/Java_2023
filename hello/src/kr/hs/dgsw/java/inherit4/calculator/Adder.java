package kr.hs.dgsw.java.inherit4.calculator;

public class Adder extends SimpleCalculator {

    public int calculate() {
        return op1 + op2;
    }

    public String getOperator() {
        return "+";
    }

    public static void main(String[] args) {
        SimpleCalculator adder = new Adder();

        adder.execute();
    }
}
