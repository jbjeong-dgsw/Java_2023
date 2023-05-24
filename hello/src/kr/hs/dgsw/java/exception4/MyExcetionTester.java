package kr.hs.dgsw.java.exception4;

public class MyExcetionTester {

    public void method1(String name) {
        try {
            method2(name);
        } catch (MyException e) {
            throw new RuntimeException(e);
        }

    }

    public void method2(String name) throws MyException {
        if (name != null) {
            System.out.printf("Hello %s\n", name);
        } else {
            MyException e = new MyException();
            throw e;
        }
    }

    public static void main(String[] args) {
        MyExcetionTester tester = new MyExcetionTester();
        tester.method1(null);
    }

}
