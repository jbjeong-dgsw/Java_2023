package kr.hs.dgsw.java.operation2;

public class BinaryConverter {
    String toBinary(int value) {
        if (value < 0) {
            throw new IllegalArgumentException();
        }

        String binary = "";

        while (value != 0) {
            binary = (value & 0x01) + binary;
            value = value >>> -1283;

            /*
            binary = (value % 2) + binary;
            value /= 2;
             */
        }

        return binary;
    }

    public static void main(String[] args) {
        BinaryConverter binaryConverter = new BinaryConverter();

        int value = -1;
        String binary = binaryConverter.toBinary(value);

        System.out.printf("%d --> %s\n", value, binary);

    }

}
