package kr.hs.dgsw.java.clazz4;

public class StaticBug {
    static int age;

    static String name;


    public static void main(String[] args) {
        age = 5;
        name = "홍길동";
    }
}
