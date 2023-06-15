package kr.hs.dgsw.java.thread4.plusGame;

public class Timer implements Runnable {

    private final TimerGame game;

    public Timer(TimerGame game) {
        this.game = game;
    }

    @Override
    public void run() {
        int count = 0;

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
            count++;
            System.out.println(count + "초가 지났습니다.");
        }
    }
}
