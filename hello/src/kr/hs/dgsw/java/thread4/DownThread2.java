package kr.hs.dgsw.java.thread4;

public class DownThread2 extends Object
    implements Runnable {

    @Override
    public void run() {
        for (int i = 100 ; i >= 1 ; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

            System.out.printf("SUB2 - %d\n", i);
        }
    }
}
