package kr.hs.dgsw.java.exception2;

import java.util.Scanner;

public class WordChecker {

    public void checkWord() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("단어를 입력하세요.");
        String word = scanner.next();

        if (isAlphabetWord(word)) {
            System.out.println(word);
        } else {
            throw new InvalidWordException();
        }

        scanner.close();
    }

    private boolean isAlphabetWord(String word) {
        for (int i = 0 ; i < word.length() ; i++) {
            char ch = word.charAt(i);

            if (ch < 'A' || (ch > 'Z' && ch < 'a') || ch > 'z') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        WordChecker wordChecker = new WordChecker();
        try {
            wordChecker.checkWord();
        } catch (Exception e) {
            System.out.println("잘못된 단어를 입력하셨습니다.");
        }

    }



}
