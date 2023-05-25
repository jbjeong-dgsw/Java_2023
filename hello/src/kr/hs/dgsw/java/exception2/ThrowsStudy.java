package kr.hs.dgsw.java.exception2;

public class ThrowsStudy {
    public void method1() throws Exception {
        System.out.println("Method 1");

        method2();

        method3();
    }

    public void method2() throws Exception {
        System.out.println("Method 2");
    }

    public void method3() throws RuntimeException {
        System.out.println("Method 3");
    }

    public static void main(String[] args) {
        ThrowsStudy study = new ThrowsStudy();
        try {
            study.method1();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
