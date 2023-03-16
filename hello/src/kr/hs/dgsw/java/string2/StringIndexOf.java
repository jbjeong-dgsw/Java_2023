package kr.hs.dgsw.java.string2;

public class StringIndexOf {

    void study() {
        String str = "대구 소프트웨어 마이스터 고등학교는 대구광역시 달성군에 있습니다.";

        showPosition(str, "대구", 5);
        showPosition(str, "고등학교", 20);
        showPosition(str, "부산", 3);
    }

    void showPosition(String str, String pattern) {
        int position = str.indexOf(pattern);

        System.out.printf("\"%s\"에서 \"%s\"는 %d 위치에 있습니다.\n",
                str, pattern, position);
    }

    void showPosition(String str, String pattern, int index) {
        int position = str.indexOf(pattern, index);

        System.out.printf("\"%s\"에서 \"%s\"는 %d 위치에 있습니다.\n",
                str, pattern, position);
    }

    public static void main(String[] args) {
        StringIndexOf object = new StringIndexOf();
        object.study();
    }

}
