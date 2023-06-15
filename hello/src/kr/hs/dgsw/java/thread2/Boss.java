package kr.hs.dgsw.java.thread2;

public class Boss {
    private SafeBox safeBox = new SafeBox();

    public void startBusiness() {
        for (int i = 0 ; i < 10 ; i++) {
            Gang gang = new Gang(this, i);
            new Thread(gang).start();
        }
    }

    public void offer(int money, int id) {
        System.out.printf("조직원 %d 상납금 %d\n", id, money);
        int temp = safeBox.getAmount();
        temp = temp + money;
        safeBox.setAmount(temp);
    }

    public void printMyMoney() {
        System.out.printf("금고에 있는 금액 : %d\n", safeBox.getAmount());
    }

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.startBusiness();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }

        boss.printMyMoney();
    }
}
