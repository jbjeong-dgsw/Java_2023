package kr.hs.dgsw.java.file2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.channels.MulticastChannel;

public class MyFileWriter {

    public void write(File file, String content) {
        OutputStream os = null;

        try {
            os = new FileOutputStream(file);

            byte[] bytes = content.getBytes();
            os.write(bytes);
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
        MyFileWriter writer = new MyFileWriter();
        File file = new File("C:/java_study/다음주.txt");
        writer.write(file, "우리는 다음 주에 싱가포르에 간다.\n매우 기대 돼\n");
        writer.append(file, "우리는 대구소프트웨어마이스터고등학교 2학년 2반입니다.");

    }


}
