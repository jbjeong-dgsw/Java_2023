package kr.hs.dgsw.java.inter4;

public class Adder implements Calculator{

    @Override
    public int calculate(int op1, int op2) {
        return op1 + op2;
    }

    @Override
    public String getOperator() {
        return "+";
    }
}
