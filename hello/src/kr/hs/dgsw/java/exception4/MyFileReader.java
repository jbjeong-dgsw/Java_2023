package kr.hs.dgsw.java.exception4;

import java.io.File;
import java.io.FileInputStream;

public class MyFileReader {

    public String readString(String filePath) {
        FileInputStream is = null;
        try {
            File file = new File(filePath);
            is = new FileInputStream(file);

            String result = "";
            byte[] buffer = new byte[1024];
            int length;

            while ((length = is.read(buffer)) > 0) {
                result += new String(buffer, 0, length);
            }

            return result;
        } catch (Exception e) {
            throw new RuntimeException("파일을 읽을 수 없습니다.");
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (Exception e1) {
            }
        }
    }

    public static void main(String[] args) {
        MyFileReader reader = new MyFileReader();
        String str = reader.readString("C:/90_etc/abcd1111.txt");
        System.out.println(str);

    }

}
