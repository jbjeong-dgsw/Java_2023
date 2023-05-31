package kr.hs.dgsw.java.exception2;

import java.io.IOException;

public class ThrowStudy {

    public int divide(int op1, int op2) {
        if (op2 == 0) {
            throw new DivideZeroException();
        }

        if (op1 > 1000) {
            throw new CapacityOverflowException();
        }

        return op1 / op2;
    }


    public void method1() {
        method2();
    }

    public void method2() throws NullPointerException {

    }



    public static void main(String[] args) {
        ThrowStudy study = new ThrowStudy();

        try {
            int result = study.divide(3, 0);
            System.out.println(result);
        } catch (DivideZeroException e) {
            System.out.println("멍충아");
        } catch (CapacityOverflowException e) {
            System.out.println("미안합니다");
        }
    }



}
