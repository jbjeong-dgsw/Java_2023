package kr.hs.dgsw.java;

public class Accumulator {

    /**
     * 입력된 값들의 합
     */
    int sum = 0;

    /**
     * 정수를 입력받아서 계속 더한다.
     *
     * @param value 추가된 값
     */
    void add(int value) {
        sum += value;
    }

    /**
     * 현재까지 누적된 값을 리턴한다.
     *
     * @return 누적 값
     */
    int getSum() {
        return sum;
    }

    /**
     * 누적된 값을 초기화한다.
     */
    void reset() {
        sum = 0;
    }

    public static void main(String[] args) {
        Accumulator object = new Accumulator();

        object.add(3);
        object.add(8);
        object.add(11);

        int value1 = object.getSum();
        System.out.println(value1);

        object.add(-5);

        int value2 = object.getSum();
        System.out.println(value2);

        object.reset();
        int value3 = object.getSum();
        System.out.println(value3);

    }


}
