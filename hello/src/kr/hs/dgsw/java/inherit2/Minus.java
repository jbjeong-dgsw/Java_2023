package kr.hs.dgsw.java.inherit2;

public class Minus extends Adder {

    @Override
    public int calculate() {
        return op1 - op2;
    }

    public static void main(String[] args) {
        Adder adder = new Minus();
        adder.setOp1(7);
        adder.setOp2(2);

        System.out.println(adder.calculate());
    }
}
