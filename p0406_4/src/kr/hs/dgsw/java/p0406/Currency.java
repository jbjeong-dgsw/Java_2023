package kr.hs.dgsw.java.p0406;

public class Currency {
    private String str;

    public String analyze(int money) {
        str = "";

        money = count(money, 50000, "오만원권");
        money = count(money, 10000, "일만원권");
        money = count(money, 5000, "오천원권");
        money = count(money, 1000, "일천원권");
        money = count(money, 500, "오백원권");
        money = count(money, 100, "일백원권");
        money = count(money, 50, "오십원권");
        money = count(money, 10, "일십원권");
        money = count(money, 5, "오원권");
        money = count(money, 1, "일원권");

        return str;
    }

    private int count(int money, int unit, String name) {
        int count = money / unit;

        if (count > 0) {
            if (str.length() > 0) {
                str += ", ";
            }
            str += name;
            str += " " + count + "장";
        }

        return money - (count * unit);
    }

    public static void main(String[] args) {
        Currency currency = new Currency();
        int money = 128562;
        String result = currency.analyze(money);
        System.out.printf("%d원은 %s 로 구성됩니다.\n", money, result);
    }
}
