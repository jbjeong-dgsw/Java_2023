package kr.hs.dgsw.java.inter4;

public class Cat implements Soundable, Jump {

    @Override
    public void makeSound() {
        System.out.println("야아옹~");
    }

    @Override
    public void jump() {
        System.out.println("짬~프");
    }

    @Override
    public void hello() {
        System.out.println("(아무런 말 없이 핡퀸다.)");
    }

    public static void main(String[] args) {
        Cat tom = new Cat();
        tom.makeSound();

        Dog doger = new Dog();
        doger.makeSound();


        Soundable pet = new Dog();
        pet.makeSound();
        pet.hello();

        Jump cat = new Cat();
        cat.jump();
        cat.hello();


    }
}
