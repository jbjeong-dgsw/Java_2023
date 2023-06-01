package kr.hs.dgsw.java.file4;

import java.io.*;

public class MyFileCopier {

    public void copy(File src, File dest) {
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(src);  // 읽어 올 파일의 input stream 생성
            os = new FileOutputStream(dest);    // 쓸 파일의 output stream 생성

            int length;
            byte[] buffer = new byte[1024]; // 과도한 메모리 사용을 방지하기 위해서 1KB 버퍼 마련

            while ((length = is.read(buffer)) > 0) {    // 읽어온 byte 개수가 0보다 크면 계속 반복
                os.write(buffer, 0, length);    // buffer 의 내용을 output stream 에 써 준다.
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (Exception e) {}
            }
            if (os != null) {
                try {
                    os.close();
                } catch (Exception e) {}
            }
        }

    }

    public static void main(String[] args) {
        MyFileCopier copier = new MyFileCopier();
        File src = new File("C:/java_study/DSC04438.JPG");
        File desc = new File ("C:/java_study/prize.jpg");
        copier.copy(src, desc);
    }

}
