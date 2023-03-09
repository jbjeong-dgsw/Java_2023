package kr.hs.dgsw.java;

import kr.hs.dgsw.java.School;

public class SchoolDoer {

    public static void main(String[] args) {

        School school = new School();
        school.enroll();
        school.enroll();
        school.enroll();
        school.graduate();

        school.countOfStudents = 5;


        school.printInformation();

    }

}
