package kr.hs.dgsw.java;

import java.io.File;
import java.util.Scanner;

public class ScannerStudy {

    private Scanner scanner = null;

    public void prepareScanner() {
        this.scanner = new Scanner(System.in);
    }

    public void testRead() {
        String str = null;

        /*
        do {
            str = this.scanner.next();
            System.out.println("출력 : " + str);
        } while (!"QUIT".equals(str));
         */

        byte value = this.scanner.nextByte();
        System.out.println("Int value : " + (value + 5));
    }

    public void closeScanner() {
        this.scanner.close();
    }

    public static void main(String[] args) {
        ScannerStudy study = new ScannerStudy();
        study.prepareScanner();
        study.testRead();
        study.closeScanner();
    }

}
