package kr.hs.dgsw.java.exception4;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class MyExcetionTester {

    public void method1(String name) {
        try {
            method2(name);
        } catch (MyException e) {
            //String message = e.getMessage();
            //Throwable cause = e.getCause();
            //cause.printStackTrace();
            //System.out.println(cause.pr);
            //e.printStackTrace();

            throw new RuntimeException(e.getMessage(), e);
        }

    }

    public void method2(String name) throws MyException {
        if (name != null) {
            System.out.printf("Hello %s\n", name);
        } else {
            //MyException e = new MyException("'name' 변수가 null이 될 수 없습니다.");
            MyException e = new MyException(new IllegalArgumentException());

            throw e;
        }
    }

    public static void main(String[] args) {
        MyExcetionTester tester = new MyExcetionTester();
        try {
            tester.method1(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
