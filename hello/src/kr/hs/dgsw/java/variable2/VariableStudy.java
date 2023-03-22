package kr.hs.dgsw.java.variable2;

public class VariableStudy {

    final int COUNT_OF_STUDENT = 0;
    final double PI = 3.1415926;


    void study() {
        int value1 = 5;
        int value2 = 3;

        String $name = "";
        String name$ = "";

        double abc_ddd = 3.2;
        int _value = 7;

        //int 0abc = 5;

        String 이름 = "홍길동";
        System.out.println(이름);

        int name = 5;
        String age = "홍길동";

        String Name = "";

        String studentName;
        String student_name;

        String student;
        String stu;

        int valueA, valueB, valueC;

        if (true) {

        }

    }

    void studyFinal() {
        final int value = 3;
        //value = 5;

        final int age;
        age = 2;
        //age = 4;
    }


    public static void main(String[] args) {
        VariableStudy study = new VariableStudy();
        study.study();
    }

}
