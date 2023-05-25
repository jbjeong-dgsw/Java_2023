package kr.hs.dgsw.java.exception2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileStudy {

    public String readFile(String filePath) {
        try {
            File file = new File(filePath);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;
            String result = "";

            while ((line = bufferedReader.readLine()) != null) {
                result += line + "\n";
            }

            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public String readFile2(String filePath)
            throws Exception {
        File file = new File(filePath);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = null;
        String result = "";

        while ((line = bufferedReader.readLine()) != null) {
            result += line + "\n";
        }

        return result;
    }

    public static void main(String[] args) {
        FileStudy study = new FileStudy();
        String str = study.readFile("C:/Users/helloaaa.txt");
        System.out.println(str);
    }

}
