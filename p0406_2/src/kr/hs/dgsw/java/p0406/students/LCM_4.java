package kr.hs.dgsw.java.p0406.students;

import java.util.Scanner;

public class LCM_4 {
    Scanner scanner = null;
    void setScanner(){
        scanner = new Scanner(System.in);
    }

    int scanInt(){
        int Value = scanner.nextInt();
        return Value;
    }

    void scannerClose(){
        if(scanner != null){
            scanner.close();
        }
    }

    int showLCM(int value1, int value2){
        for(int i = 1 ; i <= value1*value2 ; i++){
            if(i % value1 == 0 && i % value2 == 0){
                return i;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        LCM_4 lcm = new LCM_4();
        lcm.setScanner();
        int value1 = lcm.scanInt();
        int value2 = lcm.scanInt();
        lcm.showLCM(value1, value2);
        lcm.scannerClose();
    }
}
