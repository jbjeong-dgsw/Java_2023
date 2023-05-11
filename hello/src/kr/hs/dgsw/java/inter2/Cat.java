package kr.hs.dgsw.java.inter2;

public class Cat implements Sound, Eatable {

    @Override
    public void makeSound() {
        System.out.println("이야아옹");
    }

    @Override
    public void eat() {
        System.out.println("생선을 먹는다.");
    }

    public static void main(String[] args) {
        Cat tom = new Cat();
        tom.makeSound();
        tom.eat();

        Dog gang = new Dog();
        gang.makeSound();

        Sound pet = new Cat();
        pet.makeSound();
        //pet.eat();
    }
}
