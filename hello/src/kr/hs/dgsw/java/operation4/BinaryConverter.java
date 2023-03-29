package kr.hs.dgsw.java.operation4;

public class BinaryConverter {
    String toBinary(int value) {
        String result = null;

        result = toBinaryPositive(value);

        return result;
    }

    String toBinaryPositive(int value) {
        if (value < 0) {
            throw new IllegalArgumentException();
        }

        String binary = "";
        while (value > 0) {
            binary = (value % 2) + binary;
            value /= 2;
        }

        return binary;
    }



    public static void main(String[] args) {
        BinaryConverter converter = new BinaryConverter();
        String binary = converter.toBinary(-1);
        System.out.println(binary);
    }
}
