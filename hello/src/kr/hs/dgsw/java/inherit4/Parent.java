package kr.hs.dgsw.java.inherit4;

public class Parent {
    private int value1;

    protected int value2;

    public int value3;

    public int add() {
        return value1 + value2 + value3;
    }

    public void setValue1(int value) {
        this.value1 = value;
    }

    public void setValue2(int value) {
        this.value2 = value;
    }

    public void setValue3(int value) {
        this.value3 = value;
    }
}
