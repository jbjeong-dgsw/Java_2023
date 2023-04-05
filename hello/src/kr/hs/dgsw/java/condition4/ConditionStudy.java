package kr.hs.dgsw.java.condition4;

import java.util.Scanner;

public class ConditionStudy {

    void studyIf() {
        boolean flag1 = false;
        boolean flag2 = true;

        if (flag1) {
            System.out.println("좋아요");
        } else if (flag2) {
            System.out.println("그저그래요");
        } else {
            System.out.println("싫어요");
        }

        if (flag1) {
            System.out.println("ABCD");
        }

        System.out.println("1234");

        if (flag1) {
            System.out.println("ABCD");
        }

        if (flag2) {
            System.out.println("1234");
        }
        else {
            System.out.println("가나다라");
        }

    }

    void studyWhile() {
        Scanner scanner = new Scanner(System.in);
        String str = null;

        while (true) {
            str = scanner.next();
            if (str.equals("그만")) {
                break;
            }
            System.out.println(str);
        }

        scanner.close();
    }

    void studyDoWhile() {
        Scanner scanner = new Scanner(System.in);
        String str = null;

        do {
            str = scanner.next();
            System.out.println(str);
        } while (!("그만").equals(str));

        scanner.close();
    }

    void studyFor() {
        int sum = 0;

        for (int i = 1 ; i <= 100 ; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }

        sum = 0;
        for (int i = 2 ; i <= 100 ; i = i + 2) {
            sum = sum + i;
        }

        System.out.println(sum);

        for (int i = 0 ; i < 5 ; i++) {
            System.out.println(i);
        }

        for (int i = 0 ; i < 5 ; ++i) {
            System.out.println(i);
        }
    }

    void studyForEach() {
        String[] colors
                = new String[] {"red", "yellow", "green", "blue"};

        for (int i = 0 ; i < colors.length ; i++) {
            System.out.println(colors[i]);
        }

        for (String color : colors) {
            System.out.println(color);
        }
    }

    void studySwitch() {
        int value = 1;

        switch (value) {
            case 1:
                System.out.println("아주 좋아요.");
                break;
            case 2:
                System.out.println("잘 했어요");
                break;

            case 3:
            case 4:
                System.out.println("그저 그렇군요.");
                break;

            case 5:
                System.out.println("좀 더 노력하세요.");
                break;

            default:
                System.out.println("다음에는 더 잘 해 보아요.");
                break;
        }

        String name = "홍길동";

        switch (name) {
            case "홍길동":
                System.out.println("의적");
                break;

            case "아인슈타인":
                System.out.println("과학자");
                break;
        }

    }

    public static void main(String[] args) {
        ConditionStudy study = new ConditionStudy();
        study.studySwitch();
    }

}
