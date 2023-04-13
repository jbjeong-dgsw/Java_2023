package kr.hs.dgsw.java.array2;

import java.util.Random;

public class MyArray {
    int[] array = new int[10];

    void init() {
        Random random = new Random(System.currentTimeMillis());

        for (int i = 0 ; i < array.length ; i++) {
            array[i] = random.nextInt(1000);
        }
    }

    /**
     * array에서 가장 큰 값을 반환한다.
     */
    int getMax() {
        int maxValue = 0;

        for (int value : array) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        return maxValue;
    }

    /**
     * array의 각 항의 값을 432, 121, 453, 12, .... 으로 출력한다.
     */
    void printArray() {
        for(int i=0; i<array.length; i++)
        {
            if(i != 0){
                System.out.print(", ");
            }
            System.out.printf("%d", array[i]);
        }
        System.out.println();
    }

    int sum() {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    double average() {
        return sum() / 10.0;
    }

    int getIndexOfMin() {
        int index = 0;
        for (int i = 1 ; i < array.length ; i++) {
            if (array[index] > array[i]) {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.init();

        int max = myArray.getMax();
        System.out.printf("MAX value : %d\n", max);

        myArray.printArray();

        int sum = myArray.sum();
        double average = myArray.average();

        System.out.printf("합계 : %d  평균 : %.2f\n",
                sum, average);

    }

}
