package kr.hs.dgsw.java.file4;

import com.sun.deploy.util.ArrayUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class SmartFileReader {
    public byte[] readFile(File file)  {
        byte[] result = new byte[(int)file.length()];
        InputStream is = null;

        try {
            is = new FileInputStream(file);
            byte[] buffer = new byte[1024];
            int length;
            int offset = 0;

            while (true) {
                length = is.read(buffer);
                if (length > 0) {
                    copy(result, buffer, offset, length);
                    offset += length;
                } else {
                    break;
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (Exception e) {}
            }
        }

        return result;
    }

    private void copy(byte[] target, byte[] src, int offset, int length) {
        for (int i = 0 ; i < length ; i++) {
            target[i + offset] = src[i];
        }
    }


    public static void main(String[] args) throws Exception {

        File file = new File("C:/java_study/진달래꽃.txt");
        SmartFileReader fileReader = new SmartFileReader();
        byte[] bytes = fileReader.readFile(file);
        String str = new String(bytes);
        System.out.println(str);
    }
}
