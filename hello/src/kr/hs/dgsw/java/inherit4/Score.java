package kr.hs.dgsw.java.inherit4;

import java.util.Date;
import java.util.Objects;

public class Score {
    protected final int point;

    public Score(int point) {
        this.point = point;
    }

    public String getGrade() {
        if (point >= 90) {
            return "수";
        } else if (point >= 80) {
            return "우";
        } else if (point >= 70) {
            return "미";
        } else if (point >= 60) {
            return "양";
        }

        return "가";
    }


    @Override
    public String toString() {
        return String.format("점수는 %d점이고, 등급은 '%s'입니다.", point, getGrade());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Score)) {
            return false;
        }

        return getGrade() == ((Score)obj).getGrade();
    }

    @Override
    public int hashCode() {
        return Objects.hash(point);
    }

    public static void main(String[] args) {
        Object object = new Object();
        Score score = new Score(82);
        Date date = new Date();

        System.out.println(object.toString());
        System.out.println(score.toString());   // 점수는 82점이고, 등급은 '우'입니다.
        System.out.println(date.toString());

        String str1 = new String("대한민국");
        String str2 = new String("Republic Of Korea");
        boolean same = str1.equals(str2);

        Score score1 = new Score(79);
        Score score2 = new Score(80);
        System.out.println(score1.equals(date));

    }
}
