package kr.hs.dgsw.java.thread2;

public class MainThread {

    public static void main(String[] args) {

        SubThread subThread = new SubThread();
        subThread.start();

        SubThread2 subThread2 = new SubThread2();
        subThread2.start();

        SubThread3 subThread3 = new SubThread3();
        Thread thread = new Thread(subThread3);
        thread.start();

        for (int i = 0 ; i < 100 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

            System.out.println("main : " + i);
        }
    }

}
