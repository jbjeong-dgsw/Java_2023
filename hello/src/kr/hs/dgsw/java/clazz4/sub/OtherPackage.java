package kr.hs.dgsw.java.clazz4.sub;

import kr.hs.dgsw.java.clazz4.AccessModifier;

public class OtherPackage {
    public static void main(String[] args) {
        AccessModifier object = new AccessModifier();

        //object.value1 = 4;

        // value2는 private으로 선언되어 있어서
        // 다른 클래스에서는 접근할 수 없다.
        //object.value2 = 5;
        object.value3 = 6;
        //object.value4 = 7;

    }
}
