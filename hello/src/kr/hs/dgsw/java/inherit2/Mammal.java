package kr.hs.dgsw.java.inherit2;

public class Mammal extends Animal {

    @Override
    String getName() {
        return "포유류:" + super.getName();
    }

    void birth() {
        System.out.println("새끼를 낳는다.");
    }
}
