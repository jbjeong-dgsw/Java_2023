package kr.hs.dgsw.java.thread4;

public class MainThread {

    public static void main(String[] args) {
        DownThread thread1 = new DownThread();
        thread1.start();

        DownThread2 thread2 = new DownThread2();
        Thread thread = new Thread(thread2);
        thread.start();


        for (int i = 1 ; i <= 100 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

            System.out.printf("Main - %d\n", i);
        }
    }


}
