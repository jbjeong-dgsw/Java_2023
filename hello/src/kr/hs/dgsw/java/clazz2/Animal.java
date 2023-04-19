package kr.hs.dgsw.java.clazz2;

public class Animal {
    private String name;

    public static int age;

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printData() {
        System.out.printf("%s : $d\n", name, age);
    }

    public static void showData() {
        //System.out.printf("%s : $d\n", name, age);
    }


}
