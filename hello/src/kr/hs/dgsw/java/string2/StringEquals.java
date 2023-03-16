package kr.hs.dgsw.java.string2;

public class StringEquals {
    void study() {
        String name1 = "Paul";
        String name2 = "Peter";
        String name3 = "Paul";
        String name4 = new String("Paul");
        String name5 = new String("Paul");

        /*
        showEquivalent(name1, name2);
        showEquivalent(name1, name3);
        showEquivalent(name1, name4);
        showEquivalent(name4, name5);

         */

        showEquals(name1, name2);
        showEquals(name1, name3);
        showEquals(name1, name4);
        showEquals(name4, name5);
    }

    void showEquivalent(String str1, String str2) {
        boolean result = (str1 == str2);
        System.out.printf("\"%s\"와 \"%s\"는 %s. \n",
                str1, str2, (result ? "같습니다" : "다릅니다"));
    }

    void showEquals(String str1, String str2) {
        boolean result = str1.equals(str2);
        System.out.printf("\"%s\"와 \"%s\"는 %s. \n",
                str1, str2, (result ? "같습니다" : "다릅니다"));
    }

    public static void main(String[] args) {
        StringEquals stringEquals = new StringEquals();
        stringEquals.study();
    }


}
