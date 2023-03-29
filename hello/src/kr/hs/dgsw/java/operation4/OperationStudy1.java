package kr.hs.dgsw.java.operation4;

public class OperationStudy1 {
    void studyArithmetic() {
        int op1 = 5;
        int op2 = 3;

        int plus = op1 + op2;
        int minus = op1 - op2;
        int multiply = op1 * op2;
        int divide = op1 / op2;
        int modulus = op1 % op2;

        op2 = 0;
        //divide = op1 / op2;
        modulus = op1 % op2;
    }

    void studyRelational() {
        int op1 = 3;
        int op2 = 5;

        boolean result;

        result = op1 == op2;
        result = op1 > op2;
        result = op1 < op2;
        result = op1 != op2;
        result = op1 >= op2;
        result = op1 <= op2;
    }

    void studyLogical() {
        boolean op1 = true;
        boolean op2 = false;

        boolean result;

        result = op1 && op2;
        result = op1 || op2;
        //result = !op1;

        result = op1 && op2 || op1 && op2;
        result = op1 || op2 && op1 || op2;
    }

    void studyTernary() {
        boolean condition = true;
        int result = condition ? 5 : 2;
    }

    String toBinary(int value) {
        if (value == 0) {
            return "0";
        } else if(value == 1) {
            return  "1";
        }

        return toBinary(value / 2) + toBinary(value % 2);
    }

    public static void main(String[] args) {
        OperationStudy1 object = new OperationStudy1();
        //object.studyArithmetic();

        String binary = object.toBinary(-1);
        System.out.println(binary);
    }

}
