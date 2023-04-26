package kr.hs.dgsw.java.inherit2;

public class Student extends Person {

    public Student(String name) {
        super(name);
        System.out.println("Student 생성자가 호출됨");
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public static void main(String[] args) {
        Student student = new Student("Bill", 12);
    }

    /*
    @Override
    public String getName() {
        return age + "";
    }

     */
}
