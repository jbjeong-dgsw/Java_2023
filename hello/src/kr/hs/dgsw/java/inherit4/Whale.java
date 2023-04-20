package kr.hs.dgsw.java.inherit4;

public class Whale extends Mammal {

    @Override
    public void move() {
        System.out.println("헤엄친다.");
    }

    public void spout() {
        System.out.println("물을 뿜는다.");
    }

    public static void main(String[] args) {
        Whale whale1 = new Whale();
        whale1.die();
        whale1.move();

        Mammal whale2 = new Whale();
        whale2.move();
        //whale2.spout();

        System.out.println("---------");
        Whale dolphin = (Whale)whale2;
        dolphin.spout();

    }

}
