package kr.hs.dgsw.java.inherit4;

public class Dog extends Mammal {
    public void bark() {
        System.out.println("멍멍");
    }

    public static void main(String[] args) {
        Mammal mammal1 = new Whale();
        Mammal mammal2 = new Dog();

        Dog dog1 = (Dog)mammal2;
        Dog dog2 = (Dog) mammal1;
    }

}
