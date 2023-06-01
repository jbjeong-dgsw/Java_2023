package kr.hs.dgsw.java.file4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class MyFileWriter {

    public void write(File file, String content) {
        OutputStream os = null;

        try {
            os = new FileOutputStream(file);
            byte[] bytes = content.getBytes();

            os.write(bytes);
            os.flush();

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (Exception e) {}
            }
        }
    }

    public void append(File file, String content) {
        OutputStream os = null;

        try {
            os = new FileOutputStream(file, true);
            byte[] bytes = content.getBytes();

            os.write(bytes);
            os.flush();

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (Exception e) {}
            }
        }
    }

    public static void main(String[] args) {
        MyFileWriter fileWriter = new MyFileWriter();
        File file = new File("C:/java_study/서시.txt");
        fileWriter.write(file, "죽는 날까지 하늘을 우러러\n한 점 부끄럼 없기를\n");
        fileWriter.append(file, "잎새에 이는 바람에도\n나는 괴로워했다.");
    }

}
