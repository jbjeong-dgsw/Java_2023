package kr.hs.dgsw.java.operation2;

public class BitwiseStudy {

    void studyAnd() {
        int op1 = 0b11010111;
        int op2 = 0b01010011;

        int result = op1 & op2;
        System.out.printf("%d & %d = %d\n", op1, op2, result);

        op1 = 0x3A;
        op2 = 0x15;

        result = op1 & op2;
        System.out.printf("%d & %d = %d\n", op1, op2, result);

        op1 = 017;
        System.out.printf("%d\n", op1);

    }

    void studyOr() {
        int op1 = 0b00101010;
        int op2 = 0b01011101;

        int result = op1 | op2;
        System.out.printf("%d | %d = %d\n", op1, op2, result);

    }

    void studyXor() {
        int op1 = 1;
        int op2 = 1;

        int result = op1 ^ op2;
        System.out.printf("%d ^ %d = %d\n", op1, op2, result);

        op1 = 1;
        op2 = 0;

        result = op1 ^ op2;
        System.out.printf("%d ^ %d = %d\n", op1, op2, result);

        op1 = 0;
        op2 = 0;

        result = op1 ^ op2;
        System.out.printf("%d ^ %d = %d\n", op1, op2, result);

        op1 = 5;
        op2 = 2;

        result = op1 ^ op2;
        System.out.printf("%x ^ %x = %x\n", op1, op2, result);

    }

    public static void main(String[] args) {
        BitwiseStudy object = new BitwiseStudy();
        object.studyXor();
    }

}
