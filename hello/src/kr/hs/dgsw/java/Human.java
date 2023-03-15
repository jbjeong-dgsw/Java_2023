package kr.hs.dgsw.java;

public class Human {

    String name;

    int age = 0;

    double height = 0;

    void aged() {
        // 나이가 1 증가하고, 키는 8.4cm 증가한다.
        // 단 나이가 20살이 넘으며 키는 증가하지 않는다.
        age++;

        if (age <= 20) {
            height += 8.4;
        }
    }

    void print() {
        // 홍길동님의 나이는 15세이고, 키는 190.3cm입니다.

        System.out.printf("%s님의 나이는 %d세이고, 키는 %.1f입니다.\n",
                name, age, height);
    }

    public static void main(String[] args) {
        Human kangjiseok = new Human();
        kangjiseok.name = "강지석";

        for (int i = 0 ; i < 25 ; i++) {
            kangjiseok.aged();
            kangjiseok.print();
        }

    }

}
