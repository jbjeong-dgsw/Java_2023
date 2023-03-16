package kr.hs.dgsw.java.string4;

public class StringLength {
    public void study() {
        String str1 = "Hello world";
        String str2 = "홍길동";

        showLenght(str1);
        showLenght(str2);
    }

    void showLenght(String str) {
        int length = str.length();
        System.out.printf("\"%s\"의 길이는 %d입니다. \n",
                str, length);
    }

    public static void main(String[] args) {
        StringLength stringLength = new StringLength();
        stringLength.study();
    }
}
