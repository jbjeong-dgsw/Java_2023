package kr.hs.dgsw.java;

public class Accumulator {
    int sum = 0;

    void add(int value) {
        sum = sum + value;
    }

    int getSum() {
        return sum;
    }

    void resetSum() {
        sum = 0;
    }

    public static void main(String[] args) {
        Accumulator accu = new Accumulator();
        accu.add(5);
        accu.add(7);
        accu.add(3);

        int sum1 = accu.getSum();
        System.out.println(sum1);

        accu.add(-8);
        accu.add(2);

        int sum2 = accu.getSum();
        System.out.println(sum2);

        accu.resetSum();
        int sum3 = accu.getSum();
        System.out.println(sum3);

    }

}
