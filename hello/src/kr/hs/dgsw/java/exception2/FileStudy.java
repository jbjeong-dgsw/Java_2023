package kr.hs.dgsw.java.exception2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileStudy {

    public String readFile(String path) {
        File file = new File(path);

        FileInputStream is = null;

        try {
            is = new FileInputStream(file);
            byte[] buffer = new byte[1024];
            int length;
            String result = "";

            while ((length = is.read(buffer)) > 0) {
                result += new String(buffer, 0, length);
            }

            is.close();

            return result;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException  e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String readFile2(String path) throws IOException {
        File file = new File(path);
        FileInputStream is = null;

        is = new FileInputStream(file);
        byte[] buffer = new byte[1024];
        int length;
        String result = "";

        while ((length = is.read(buffer)) > 0) {
            result += new String(buffer, 0, length);
        }

        is.close();

        return result;
    }


    public static void main(String[] args) {
        FileStudy study = new FileStudy();
        String str = study.readFile("c:/90_etc/abcd.jpg");

        System.out.println(str);
    }

}
