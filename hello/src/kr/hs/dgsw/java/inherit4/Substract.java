package kr.hs.dgsw.java.inherit4;

public class Substract extends Adder {
    @Override
    public int calculate() {
        return op1 - op2;
    }

    public static void main(String[] args) {
        Adder adder = new Substract();
        adder.setOp1(7);
        adder.setOp2(4);

        System.out.println(adder.calculate());
    }

}
