package kr.hs.dgsw.java.thread4.plusGame;

public class PlusQuestion implements Question {
    private final int op1;

    private final int op2;

    public PlusQuestion(int op1, int op2) {
        this.op1 = op1;
        this.op2 = op2;
    }

    @Override
    public boolean isCorrectAnswer(int answer) {
        return ((op1 + op2) == answer);
    }

    @Override
    public void showQuestion() {
        System.out.printf("%d + %d = ", op1, op2);
    }
}
