package kr.hs.dgsw.java.p0406;

import java.util.Scanner;

public class PerfectNumber {

    public boolean isPerfectNumber(int number) {
        int[] aliquots = findAliquot(number);
        int sum = 0;

        for (int value : aliquots) {
            sum += value;
        }

        return (number == sum);
    }

    private int[] findAliquot(int number) {
        int[] aliquots = new int[number];

        int index = 0;
        for (int i = 1 ; i < number ; i++) {
            if (isAliquot(number, i)) {
                aliquots[index] = i;
                index++;
            }
        }

        int[] result = new int[index];
        for (int i = 0 ; i < index ; i++) {
            result[i] = aliquots[i];
        }

        return result;
    }

    private boolean isAliquot(int number, int value) {
        return ((number % value) == 0);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("양의 정수를 입력하세요.");
        int value = scanner.nextInt();

        PerfectNumber primeNumber = new PerfectNumber();
        boolean flag = primeNumber.isPerfectNumber(value);
        System.out.printf("%d는 완전수가 %s \n", value, (flag ? "맞습니다" : "아닙니다."));

        scanner.close();
    }

}
