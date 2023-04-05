package kr.hs.dgsw.java.condition4;

public class Grade {

    public String decideGrade(int score) {
        if (score >= 90) {
            return "수";
        } else if (score >= 80) {
            return "우";
        } else if (score >= 70) {
            return "미";
        } else if (score >= 60) {
            return "양";
        } else {
            return "가";
        }
    }

    public String decideGrade1(int score) {
        switch (score / 10 ) {
            case 10:
            case 9:
                return "수";
            case 8:
                return "우";
            case 7:
                return "미";
            case 6:
                return "양";
            default:
                return "가";
        }
    }
}
