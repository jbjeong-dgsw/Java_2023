package kr.hs.dgsw.java.inherit2;

public /*final*/ class Person {
    protected final String name;

    protected int age;

    public Person(String name) {
        System.out.println("Person의 생성자가 호출됨");
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }

    public final String getName() {
        return name;
    }

    public static void main(String[] args) {
        Person smith = new Person("Smith");
    }
}
