package kr.hs.dgsw.java.clazz2;

public class Doer {

    public static void main(String[] args) {
        Animal lion = new Animal("사자");
        //lion.setName("사자");
        lion.setAge(10);

        Animal rabbit = new Animal();
        rabbit.setName("토끼");
        rabbit.setAge(5);

        rabbit.age = 12;
        Animal.age = 15;

        rabbit.name = "코끼리";
        //Animal.name = "코끼리";

        System.out.printf("%s 의 나이는 %d 살입니다.\n",
                lion.getName(), lion.getAge());

        System.out.printf("%s 의 나이는 %d 살입니다.\n",
                rabbit.getName(), rabbit.getAge());


        Delimiter object = new Delimiter();

        object.value1 = "Mountain";
        object.value2 = "Sea";
        object.value3 = "House";

    }

}
