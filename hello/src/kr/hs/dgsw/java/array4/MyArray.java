package kr.hs.dgsw.java.array4;

import java.util.Random;

public class MyArray {
    int[] array = new int[15];

    void makeArray() {
        Random random = new Random(System.currentTimeMillis());

        for (int i = 0 ; i < array.length ; i++) {
            array[i] = random.nextInt(1000);
        }
    }

    void printArray() {
        // array 배열 안에 있는 값들을 3, 7, 124, 12, 532, 12 ... 와 같이 출력하세요
        String str = "";

        for (int i = 0 ; i < array.length ; i++) {
            if (i > 0) {
                str += ", ";
            }
            str += array[i];
        }

        System.out.println(str);
    }

    /**
     * array 안에 있는 정수 가운데, 가장 작은 수를 가진 위치(index)을 반환한다.
     */
    int min() {
       int key = 0;
       for (int i = 0; i < array.length; i++) {
           if (array[key] > array[i]) {
               key = i;
           }
       }
       return key;
    }

    /**
     * array 안의 정수들의 합을 반환한다.
     */
    int sum() {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }


    /**
     * array 안의 정수들의 평균값(실수)을 반환한다.
     */
    double average() {
        return sum() / (double)array.length;
    }

    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.makeArray();
        myArray.printArray();

        int minIndex = myArray.min();
        System.out.println(minIndex);

        int sum = myArray.sum();
        System.out.println("합계 : " + sum);

        double average = myArray.average();
        System.out.printf("평균값 : %.2f\n", average);
    }

}
