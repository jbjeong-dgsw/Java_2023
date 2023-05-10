package kr.hs.dgsw.java.inherit2.polygon;

import java.util.Random;

public class Lotto {

    public static void main(String[] args) {

        Random random = new Random(System.currentTimeMillis());
        int number = random.nextInt(18) + 1;
        System.out.println("당첨자 : " + number);


    }

}
