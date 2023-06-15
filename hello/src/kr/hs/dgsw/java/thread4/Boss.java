package kr.hs.dgsw.java.thread4;

public class Boss {

    private int amount = 0;

    public void play(int countOfGangs) {
        for (int i = 0 ; i < countOfGangs ; i++) {
            new Thread(new Gang(this, i)).start();
        }
    }


    public void offer(int id) {
        System.out.printf("%d가 상납함\n", id);

        int temp = amount;
        temp += 1;

        save(temp);
    }

    private void save(int amount) {
        try {
            Thread.sleep(0, 1);
        } catch (InterruptedException e) {
        }
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.play(10);

        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }

        System.out.println(boss.getAmount());

    }

}
