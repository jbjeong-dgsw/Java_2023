package kr.hs.dgsw.java.inherit2;

public class Child extends Parent {
    String job;

    int getSalary() {
        return 100000000;
    }

    void printInformation() {
        System.out.printf("%s 의 직업은 %d 입니다.",
                this.name, this.job);
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.job = "SW 개발자";
        child.name = "아들";
        child.sayHello();
    }

}
