package kr.hs.dgsw.java.thread4.plusGame;

public interface TimerGame {
    public void execute();

    public void setQuestionMaker(QuestionMaker questionMaker);

    public void printResult();

    public void setTimeOver();
}
