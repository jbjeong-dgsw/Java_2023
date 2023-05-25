package kr.hs.dgsw.java.exception4;

import java.util.Scanner;

public class Word {

    public String getAlphabetString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력하세요.");
        String str = scanner.next();
        scanner.close();

        if (!isAlphabetString(str)) {
            throw new RuntimeException("잘못된 문자열입니다.");
        }

        return str;
    }

    /*private boolean isAlphabetString(String str) {
        for (int i = 0 ; i < str.length() ; i++) {
            char ch = str.charAt(i);

            if (ch < 'A' || (ch > 'Z' && ch < 'a') || ch > 'z') {
                return false;
            }
        }
        return true;
    }*/

    private boolean isAlphabetString(String str) {
        return str.matches("^[a-zA-Z]+$");
    }

    public static void main(String[] args) {
        Word word = new Word();
        try {
            String str = word.getAlphabetString();
            System.out.println(str);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
