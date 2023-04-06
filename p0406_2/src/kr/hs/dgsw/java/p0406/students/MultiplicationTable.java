package kr.hs.dgsw.java.p0406.students;

import java.util.Scanner;

public class MultiplicationTable {
    void gugudan(int number) {

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d x %d = %d\n", number, i, number * i);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        MultiplicationTable multiplicationTable = new MultiplicationTable();
        multiplicationTable.gugudan(number);

        scanner.close();
    }

}
