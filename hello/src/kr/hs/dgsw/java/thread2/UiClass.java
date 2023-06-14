package kr.hs.dgsw.java.thread2;

import java.util.Scanner;

public class UiClass {

    private Scanner scanner = new Scanner(System.in);


    public void input() {
        while (true) {
            System.out.println("정수를 입력하세요.");
            int value = scanner.nextInt();

            if (value == 0) {
                break;
            }

            calculateFactorial(value);
        }
        scanner.close();
        System.out.println("프로그램이 종료되었습니다.");
    }

    private void calculateFactorial(int value) {
        // 새 Thread 을 만들어 계산하고, 결과를 출력한다
        FactorialThread factorialThread = new FactorialThread(value);
        Thread thread = new Thread(factorialThread);
        thread.setDaemon(false);
        thread.setName("팩토리얼 thread");
        thread.setPriority(5);
        thread.start();
    }

    public static void main(String[] args) {
        UiClass uiClass = new UiClass();
        uiClass.input();
    }

}
