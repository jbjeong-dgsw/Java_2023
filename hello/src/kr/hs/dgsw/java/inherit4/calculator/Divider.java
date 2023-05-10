package kr.hs.dgsw.java.inherit4.calculator;

public class Divider extends SimpleCalculator {
    @Override
    public int calculate() {
        return op1 / op2;
    }

    @Override
    public String getOperator() {
        return "/";
    }

    public static void main(String[] args) {
        SimpleCalculator divider = new Divider();
        divider.execute();
    }
}
