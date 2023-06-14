package kr.hs.dgsw.java.thread2;

public class SubThread2 extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }

        int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            sum += i;
        }
        System.out.println("SUM : " + sum);
    }
}
