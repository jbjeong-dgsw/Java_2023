package kr.hs.dgsw.java.inherit2;

public class Bird extends Animal {

    @Override
    void move() {
        System.out.println("하늘을 날다");
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.move();

        Animal animal = new Animal();
        animal.move();

        Animal eagle = new Bird();
        eagle.move();
        System.out.println(eagle);

        //Bird parrot = new Animal();
    }

}
