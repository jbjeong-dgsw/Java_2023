package kr.hs.dgsw.java.file2;

import java.io.*;

public class MyFileCopier {

    public void copy(File src, File dest) {
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(src);
            os = new FileOutputStream(dest);

            int length;
            byte[] buffer = new byte[1024];

            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
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

}
