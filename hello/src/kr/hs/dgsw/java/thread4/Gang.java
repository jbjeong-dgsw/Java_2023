package kr.hs.dgsw.java.thread4;

public class Gang implements Runnable {

    private final Boss boss;

    private int id;

    public Gang(Boss boss, int id) {
        this.boss = boss;
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 0 ; i < 10 ; i++) {
            this.boss.offer(id);
        }
        System.out.println(id + " 종료됨");
    }
}
