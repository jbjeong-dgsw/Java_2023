package kr.hs.dgsw.java.exception4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MyFileReader {

    public String readString(String filePath) {
        FileInputStream is = null;
        try {
            File file = new File(filePath);
            is = new FileInputStream(file);

            String result = "";
            String str = null;
            int length = 0;
            byte[] buffer = new byte[1024];

            while ((length = is.read(buffer)) > 0) {
                str = new String(buffer, 0, length);
                result += str;
            }

            return result;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e1) {}
            }
        }
    }

    public static void main(String[] args) {
        MyFileReader reader = new MyFileReader();
        String str = reader.readString("C:/Users/hello1.txt");
        System.out.println(str);
    }

}
