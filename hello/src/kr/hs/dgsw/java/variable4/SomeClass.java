package kr.hs.dgsw.java.variable4;

public class SomeClass {

    int count;

    String name;

    final int VALUE = 5;

    final double PI = 3.1415926;

    void someMethod1() {
        int age = 18;
        name = "홍길동";

        if (true) {
            int value1 = 5;
            //int age = 22;
            System.out.println(value1);
        }

        for (int i = 0 ; i < 10 ; i++) {
            int value1 = i + 2;
        }

        //value1 = 7;

    }

    void someMethod2(int value) {

        //int value;

        this.name = "abcd";

        String name = "송혜교";

        System.out.println(this.name);
        System.out.println(name);

        //System.out.println(age);
    }

    void doSomething(final int param) {
        final int value = 5;
        //value = 7;

        final int value1;
        value1 = 10;
        //value1 = 11;
    }

    public static void main(String[] args) {
        SomeClass object = new SomeClass();
        object.someMethod1();
        object.someMethod2(3);

    }

}
