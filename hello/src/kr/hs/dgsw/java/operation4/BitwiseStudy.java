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

    void studyNot() {
        byte value = (byte)0b11110101;
        byte value2 = (byte)~value;

        System.out.printf("~%d = %02X\n", value, value2);
    }

    void studyLeftShift() {
        byte value = 64;
        byte result;
        int count = 1;

        result = (byte)(value << count);
        System.out.printf("%02X << %d = %02X (%d)\n", value, count, result, result);
    }

    void studyRightShift() {
        int value = -1;
        int result;
        int count = 1;

        //result = (value >>> count);
        System.out.printf("%02X >> %d = %02X\n", value, count, value >> count);
        System.out.printf("%02X >>> %d = %02X\n", value, count, value >>> count);
    }

    public static void main(String[] args) {
        BitwiseStudy object = new BitwiseStudy();
        object.studyLeftShift();
    }

}
