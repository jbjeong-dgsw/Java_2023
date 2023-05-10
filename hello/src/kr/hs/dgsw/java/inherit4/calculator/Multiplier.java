package kr.hs.dgsw.java.inherit4.calculator;

public class Multiplier extends SimpleCalculator {
    @Override
    public int calculate() {
        return op1 * op2;
    }

    @Override
    public String getOperator() {
        return "*";
    }
}
