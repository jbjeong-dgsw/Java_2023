package kr.hs.dgsw.java.file4;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class IdotFileReader {

    public byte[] readFile(File file)  {
        long length = file.length();
        byte[] result = new byte[(int)length];
        InputStream is = null;

        try {
            is = new FileInputStream(file);
            int index = 0;

            while (index < length) {
                result[index] = (byte)is.read();
                index++;
            }

            return result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (Exception e) {

                }
            }
        }
    }

    public static void main(String[] args) throws Exception {

        File file = new File("C:/java_study/진달래꽃.txt");
        IdotFileReader fileReader = new IdotFileReader();
        byte[] bytes = fileReader.readFile(file);
        String str = new String(bytes);
        System.out.println(str);
    }

}
