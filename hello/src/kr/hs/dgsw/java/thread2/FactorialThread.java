package kr.hs.dgsw.java.thread2;

public class FactorialThread implements Runnable {

    private final int value;

    public FactorialThread(int value) {
        this.value = value;
    }


    @Override
    public void run() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
        }

        int result = 1;
        for (int i = value ; i >= 2 ; i--) {
            result *= i;
        }

        System.out.printf("%d! = %d\n", value, result);
    }
}
