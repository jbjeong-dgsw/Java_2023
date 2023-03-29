package kr.hs.dgsw.java.operation2;

public class CastingStudy {

    void studySome() {
        float doubleValue;
        int intValue = 3;
        long longValue = 3L;

        doubleValue = 3;
        intValue = (int)3.14;

        longValue = intValue;
        intValue = (int)longValue;

        String value = "123";
        //int value2 = (int)value;

        //boolean booleanValue = (boolean)1;

        char ch = 'A';
        intValue = (int)ch;
    }

}
