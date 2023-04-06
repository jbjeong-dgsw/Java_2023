package kr.hs.dgsw.java.p0406;

public class Factorial {

    public int factorial(int value) {
        int result = 1;

        for (int i = 2 ; i <= value ; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        int value = 5;
        int result = new Factorial().factorial(value);
        System.out.println(result);
    }

}
