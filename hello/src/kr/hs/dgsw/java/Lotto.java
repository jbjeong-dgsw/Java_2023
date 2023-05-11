package kr.hs.dgsw.java;

import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());
        int number = random.nextInt(18) + 1;

        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
        }

        System.out.println("뽑힌 사람 : " + number);
    }
}
