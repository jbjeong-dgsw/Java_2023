package kr.hs.dgsw.java.p0406.students;

import java.util.Scanner;

public class ProjectMoney {
    private int value;

    public ProjectMoney(int tmp) {
        this.value = tmp;
    }

    public int ohManWon(int money){
        int m50000;
        m50000 = money / 50000;
        value -= m50000 * 50000;
        return m50000;
    }

    public int manWon(int money){
        int m_10000;
        m_10000 = money / 10000;
        value -= m_10000 * 10000;
        return m_10000;
    }

    public int ohChenWon(int money) {
        int m_5000;
        m_5000 = money / 5000;
        value -= m_5000 * 5000;
        return m_5000;
    }

    public int chenWon(int money) {
        int m_1000;
        m_1000 = money / 1000;
        value -= m_1000 * 1000;
        return m_1000;
    }

    public int ohBackWon(int money) {
        int m_500;
        m_500 = money / 500;
        value -= m_500 * 500;
        return m_500;
    }

    public int backWon(int money) {
        int m_100;
        m_100 = money / 100;
        value -= m_100 * 100;
        return m_100;
    }

    public int sipWon(int money) {
        int m_10;
        m_10 = money / 10;
        value -= m_10 * 10;
        return m_10;
    }

    public void sum(){
        System.out.println("오만원권" + ohManWon(value) + "장");
        System.out.println("일만원권" + manWon(value) + "장");
        System.out.println("오천원권" + ohChenWon(value) + "장");
        System.out.println("일천원권" + chenWon(value) + "장");
        System.out.println("오백원권" + ohBackWon(value) + "장");
        System.out.println("일백원권" + backWon(value) + "장");
        System.out.println("일십원권" + sipWon(value) + "장");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProjectMoney project = new ProjectMoney(scanner.nextInt());
        project.sum();

    }
}
