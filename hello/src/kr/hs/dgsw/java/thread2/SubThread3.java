package kr.hs.dgsw.java.thread2;

public class SubThread3 extends Object
    implements Runnable {

    @Override
    public void run() {
        for (int i = 0 ; i < 100 ; i++) {
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
            }

            System.out.println("sub3 : " + i);
        }
    }
}
