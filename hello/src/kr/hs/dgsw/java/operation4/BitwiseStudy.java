package kr.hs.dgsw.java.operation4;

public class BitwiseStudy {

    void studyAnd() {
        int op1 = 5;
        int op2 = 2;

        int result = op1 & op2;

        System.out.printf("%d & %d = %d\n", op1, op2, result);
    }

    void studyOr() {
        int op1 = 0b1011101;
        int op2 = 0017;

        int result = op1 | op2;

        System.out.printf("%d | %d = %d\n", op1, op2, result);
    }

    void studyXor() {
        int op1 = 0b1010;
        int op2 = 0b0011;

        int result = op1 ^ op2;
        System.out.printf("%d ^ %d = %d\n", op1, op2, result);
    }

    public static void main(String[] args) {
        BitwiseStudy object = new BitwiseStudy();
        object.studyXor();
    }

}
