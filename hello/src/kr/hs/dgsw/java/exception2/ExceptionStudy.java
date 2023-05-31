package kr.hs.dgsw.java.exception2;

public class ExceptionStudy {

    public void method1() {

        String str = null;
        int length = str.length();

        int[] array = new int[5];
        array[7] = 3;

    }

    public int divide(int op1, int op2) {
        try {
            System.out.println("location 1");
            int result = op1 / op2;
            System.out.println("location 2");
            return result;
        } catch(Exception e) {
            System.out.println("location 3");
            return 0;
        }

    }


    public static void main(String[] args) {
        ExceptionStudy study = new ExceptionStudy();
        //study.method1();
        int value = study.divide(5, 3);
        System.out.println(value);

    }

}
