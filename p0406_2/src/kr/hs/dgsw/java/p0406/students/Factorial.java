package kr.hs.dgsw.java.p0406.students;

public class Factorial {
    public int FactorialExam(int number) {
        int value = 1;
        for (int i = 1; i <= number; i++) {
            value = value * i;
        }
        return value;
    }

    public static void main(String[] args) {
        int number = 4;
        Factorial factorial = new Factorial();
        factorial.FactorialExam(number);
    }
}
