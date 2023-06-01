package kr.hs.dgsw.java.file2;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class SmartFileReader implements MyFileReader {

    @Override
    public byte[] read(File file) {
        InputStream is = null;

        try {
            is = new FileInputStream(file);
            long length = file.length();
            byte[] result = new byte[(int)length];

            length = is.read(result);

            return result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (Exception e) {}
            }
        }
    }

    public static void main(String[] args) {
        MyFileReader reader = new SmartFileReader();
        File file = new File("C:/java_study/abcd.txt");
        byte[] bytes = reader.read(file);
        System.out.println(Arrays.toString(bytes));
        String str = new String(bytes);
        System.out.println(str);
    }
}
