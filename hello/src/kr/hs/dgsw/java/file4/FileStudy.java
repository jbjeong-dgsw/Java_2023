package kr.hs.dgsw.java.file4;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileStudy {

    public void studyFile() {
        File file = null;
        File file1 = null;

        file = new File("c:/Users/hello.txt");
        file1 = new File("c:/Users/hello123.txt");

        // 파일이 실제로 존재하는 지 여부를 판단
        System.out.printf("%s 존재 여부 %b\n", file.getName(), file.exists());
        System.out.printf("%s 존재 여부 %b\n", file1.getName(), file1.exists());

        File dir = new File("c:/Users/");
        System.out.printf("%s 존재 여부 %b\n", dir.getName(), dir.exists());
        System.out.printf("%s 의 디렉토리 여부 %b\n",
                dir.getName(), dir.isDirectory());
        System.out.printf("%s 의 파일 여부 %b\n",
                dir.getName(), dir.isFile());

        System.out.printf("%s 의 디렉토리 여부 %b\n",
                file1.getName(), file1.isDirectory());
        System.out.printf("%s 의 파일 여부 %b\n",
                file1.getName(), file1.isFile());

        File subDir = new File(dir, "child1");
        //subDir.mkdir();

        subDir.delete();
    }

    public void makeFile(String path, String fileName) throws Exception {
        File file = new File(path, fileName);
        System.out.printf("%s의 존재 여부 : %b\n", fileName, file.exists());

        file.createNewFile();

        System.out.printf("%s의 존재 여부 : %b\n", fileName, file.exists());
    }

    public void deleteFile(String path, String fileName) {
        File file = new File(path, fileName);
        System.out.printf("%s의 존재 여부 : %b\n", fileName, file.exists());

        file.delete();

        System.out.printf("%s의 존재 여부 : %b\n", fileName, file.exists());
    }

    public void printFileInformation(File file) {
        // 파일의 크기
        long size = file.length();
        System.out.printf("%s의 크기 : %d\n", file.getName(), size);

        // 파일 수정 시각
        long time = file.lastModified();
        Date date = new Date(time);
        SimpleDateFormat dateFormat =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.printf("%s의 마지막 수정 시각 : %s\n",
                file.getName(), dateFormat.format(date));
    }

    public void printFiles(File directory) {
        String[] names = directory.list();
        for (String name : names) {
            File file = new File(directory, name);

            System.out.printf("\t%s  %d\n", name,
                    file.length());
        }
    }

    public void printFiles2(File directory) {
        File[] files = directory.listFiles();
        for (File file : files) {
            System.out.printf("\t%s  %d\n",
                    file.getName(),
                    file.length());
        }
    }

    public void printDirectory(File directory) {
        File[] files = directory.listFiles();

        for (File file : files) {
            printFileData(file);
        }
    }

    private static final SimpleDateFormat DATE_FORMAT =
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private void printFileData(File file) {
        StringBuilder buffer = new StringBuilder();

        buffer.append(DATE_FORMAT.format(file.lastModified())).append("\t");
        buffer.append(file.isDirectory() ? "<DIR>" : "     ").append("\t");
        buffer.append(String.format("%12d", file.length())).append("\t");
        buffer.append(file.getName());

        System.out.println(buffer.toString());
    }

    public static void main(String[] args) throws Exception {
        FileStudy study = new FileStudy();
        //study.studyFile();

        study.makeFile("C:/java_study", "dgsw.txt");
        study.deleteFile("C:/java_study", "dgsw.txt");

        File file = new File("C:/java_study", "진달래꽃.txt");
        study.printFileInformation(file);

        File directory = new File("C:/java_study");
        study.printFiles(directory);

        File dir2 = new File("C:/Users/user");
        study.printDirectory(dir2);

    }



}
