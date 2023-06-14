package kr.hs.dgsw.java.thread2;

public class SubThread extends Thread {

    @Override
    public void run() {
        for (int i = 0 ; i < 100 ; i++) {
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
            }

            System.out.println("sub : " + i);
        }
    }
}
