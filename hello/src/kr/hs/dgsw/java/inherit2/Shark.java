package kr.hs.dgsw.java.inherit2;

public class Shark extends Fish {

    void jaws() {
        System.out.println("스필버그");
    }
    
    public static void main(String[] args) {
        Shark shark = new Shark();
        shark.sleep();
        shark.eat();
        shark.jaws();

        Animal animal = new Shark();
        animal.move();
        //animal.jaws();
    }

}
