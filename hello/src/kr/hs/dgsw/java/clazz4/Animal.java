package kr.hs.dgsw.java.clazz4;

public class Animal {

    private String name;

    private static String category;

    public Animal() {
        //this.name = "동물";
        this("동물");
        System.out.println("생성됨");

    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static void printName() {
        // static method에서는 object 변수에 접근할 수 없다.
        //System.out.println(name);
    }

    public static void printCategory() {
        System.out.println(category);
    }

    public String hello() {
        return "hello";
    }

    public static void main(String[] args) {
        Animal elephant = new Animal("코끼리");
        Animal.category = "육상동물";

        Animal turtle = new Animal("거북이");
        Animal.category = "해양동물";

        System.out.printf("%s는 %s입니다.\n",
                elephant.name, elephant.category);

        System.out.printf("%s는 %s입니다.\n",
                turtle.name, turtle.category);
    }
}
