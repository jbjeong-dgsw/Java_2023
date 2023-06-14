package kr.hs.dgsw.java.thread4.plusGame;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Scanner;

public class PlusGame implements TimerGame {
    private static final int COUNT = 5;

    private static final long LIMIT = 2000;

    private QuestionMaker questionMaker;

    private Scanner scanner = new Scanner(System.in);

    @Override
    public void execute() {
        for (int i = 0 ; i < COUNT ; i++) {
            Question question = questionMaker.makeQuestion();
            question.showQuestion();

            Thread timer = new Thread(new Timer(this, LIMIT));
            timer.start();

            scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            System.out.println("  answer : " + answer);
            if (question.isCorrectAnswer(answer)) {
                System.out.println("정답입니다.");
            } else {
                System.out.println("오답입니다.");
            }
        }

        scanner.close();
    }

    @Override
    public void setQuestionMaker(QuestionMaker questionMaker) {
        this.questionMaker = new PlusQuestionMaker();
    }

    @Override
    public void printResult() {

    }

    @Override
    public void setTimeOver() {
        System.out.println("setTimeOver");

        Thread.interrupted();
    }

    public static void main(String[] args) {
        TimerGame game = new PlusGame();
        game.setQuestionMaker(new PlusQuestionMaker());
        game.execute();
        game.printResult();
    }

}
