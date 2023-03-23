package kr.hs.dgsw.java.dataType2;

public class DataTypeStudy {

    void studyInteger() {
        byte byteValue = 1;
        byteValue = 127;
        byteValue = -128;

        short shortValue = 1;
        System.out.printf("byte type의 범위 : %d ~ %d \n",
                Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("short type의 범위 : %d ~ %d \n",
                Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("int type의 범위 : %d ~ %d \n",
                Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("long type의 범위 : %d ~ %d \n",
                Long.MIN_VALUE, Long.MAX_VALUE);

        byteValue = 127;
        byteValue++;

        int value1 = 1500000000;
        int value2 = 1800000000;
        System.out.printf("%d + %d = %d \n",
                value1, value2, (value1 + value2));

        shortValue = byteValue;
        //byteValue = shortValue;
    }

    void studyFloat() {
        float floatValue = 3.1415926535897932384626433832795F;
        double doubleValue = 3.1415926535897932384626433832795;

        System.out.println(floatValue);
        System.out.println(doubleValue);
    }

    void studyBoolean() {
        boolean success = true;
        success = false;

        int value = 1;
        if (value == 0) {
            ///  ....
        }
    }

    void studyChar() {
        char ch = '0';

        for (int i = 0 ; i < 256 ; i++) {
            //System.out.printf("%d %2X - %c\n", i, i, (char)i);
        }

        char ch1 = (char)44033;
        System.out.printf("%d - %c\n", (int)ch1, ch1);

        char ch2 = '가';
        System.out.printf("%d - %c\n", (int)ch2, ch2);

        int countOfKorean = '힣' - '가' + 1;
        System.out.printf("한글 코드의 개수는 %d 입니다.\n", countOfKorean);

        for (char ch3 = '가' ; ch3 < '나' ; ch3++) {
            System.out.printf("%d - %c\n", (int)ch3, ch3);
        }
    }

    void studyWrapperClass() {
        Integer intValue = 3;
        int value2 = intValue;

    }

    public static void main(String[] args) {
        DataTypeStudy dataTypeStudy = new DataTypeStudy();
        //dataTypeStudy.studyInteger();
        //dataTypeStudy.studyFloat();
        dataTypeStudy.studyChar();
    }

}
