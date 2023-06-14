package kr.hs.dgsw.java.thread4.plusGame;

public class Timer implements Runnable {
    private final long limit;

    private final TimerGame game;

    public Timer(TimerGame game, long limit) {
        this.game = game;
        this.limit = limit;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(limit);
        } catch (InterruptedException e) {

        }

        game.setTimeOver();
    }
}
