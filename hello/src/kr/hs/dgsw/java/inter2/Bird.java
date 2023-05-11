package kr.hs.dgsw.java.inter2;

public class Bird implements Sing {

    @Override
    public void sing() {
        System.out.println("꾀꼴꾀꼴~");
    }

    @Override
    public void makeSound() {
        System.out.println("짹짹");
    }
}
