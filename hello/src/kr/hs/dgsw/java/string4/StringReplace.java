package kr.hs.dgsw.java.string4;

public class StringReplace {
    void study() {
        String str = "대구 소프트웨어 마이스터 고등학교 2학년 대구광역시 달성군";

        showReplace(str, "대구", "부산");
    }

    void showReplace(String str, String pattern, String newWord) {
        String newStr = str.replaceAll(pattern, newWord);
        System.out.printf("\"%s\" -> \"%s\"\n", str, newStr);
    }

    public static void main(String[] args) {
        StringReplace stringReplace = new StringReplace();
        stringReplace.study();
    }

}
