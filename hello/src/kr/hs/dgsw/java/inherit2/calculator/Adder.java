package kr.hs.dgsw.java.inherit2.calculator;

public class Adder extends Calculator {

    @Override
    public int calculate() {
        return op1 + op2;
    }

    public static void main(String[] args) {
        Calculator adder = new Adder();
        adder.execute();
    }
}
