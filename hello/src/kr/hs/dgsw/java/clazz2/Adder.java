package kr.hs.dgsw.java.clazz2;

public class Adder {
    private final int value1;

    private final int value2;

    public Adder(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public int getResult() {
        return calculate();
    }

    private int calculate() {
        return this.value1 + this.value2;
    }

    public static void main(String[] args) {
        Adder adder = new Adder(4, 8);
        System.out.printf("계산 결과 : %d\n", adder.getResult());
    }

}
