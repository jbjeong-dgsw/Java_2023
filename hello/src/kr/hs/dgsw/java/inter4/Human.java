package kr.hs.dgsw.java.inter4;

public class Human implements Sing {

    @Override
    public void makeSound() {
        System.out.println("데헷");
    }

    @Override
    public void hello() {

    }

    @Override
    public void sing() {
        System.out.println("랄랄라~");
    }
}

