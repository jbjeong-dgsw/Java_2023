package kr.hs.dgsw.java.operation2;

public class OperationStudy {

    void studyArithmetic() {
        int op1 = 5;
        int op2 = 4;

        int plus = op1 + op2;
        int minus = op1 - op2;
        int multiply = op1 * op2;
        int divide = op1 / op2;
        int modulus = op1 % op2;

        int fail = 5 / 0;
        fail = 5 % 0;
    }

    void studyRelation() {
        int op1 = 5;
        int op2 = 3;

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
        result = !op1;

        result = op1 && op2 || op1;
        result = op1 || op2 && op1;
    }

    void studyTernary() {
        boolean condition = true;
        int result = condition ? 5 : 4;
    }

    public static void main(String[] args) {
        OperationStudy object = new OperationStudy();
        object.studyArithmetic();
    }
}
