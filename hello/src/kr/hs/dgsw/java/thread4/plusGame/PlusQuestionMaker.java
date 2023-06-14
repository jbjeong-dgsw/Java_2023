package kr.hs.dgsw.java.thread4.plusGame;

import java.util.Random;

public class PlusQuestionMaker implements QuestionMaker {
    private final Random random = new Random(System.currentTimeMillis());

    @Override
    public Question makeQuestion() {
        PlusQuestion question =
                new PlusQuestion(random.nextInt(900) + 100,
                        random.nextInt(900) + 100);

        return question;
    }
}
