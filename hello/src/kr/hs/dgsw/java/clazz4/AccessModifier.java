package kr.hs.dgsw.java.clazz4;

public class AccessModifier {
    int value1;

    private int value2;

    public int value3;

    protected int value4;

    public int getValue2() {
        return this.value2;
    }

    public static void main(String[] args) {
        AccessModifier object = new AccessModifier();

        object.value1 = 4;
        object.value2 = 5;
        object.value3 = 6;
        object.value4 = 7;
    }
}
