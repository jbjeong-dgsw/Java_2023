package kr.hs.dgsw.java.operation4;

public class CastingStudy {

    void studySome() {
        int intValue = 3;
        double doubleValue = 3;

        intValue = (int)-3.6;

        System.out.println(intValue);

        long longVaule = intValue;
        intValue = (int)longVaule;

        //boolean bool = (boolean)0;

        char ch = 'A';
        intValue = (int)ch;

        String str = "123";
        //intValue = (int)str;

    }

    public static void main(String[] args) {
        CastingStudy object = new CastingStudy();
        object.studySome();
    }

}
