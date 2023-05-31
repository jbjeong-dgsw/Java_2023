package kr.hs.dgsw.java.file2;

import kr.hs.dgsw.java.exception2.FileStudy;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileClassStudy {

    /**
     * File 클래스 기본
     */
    public void basic() {

        File file1 = new File("C:/java_study/대소고.txt");
        File file2 = new File("C:/java_study", "대소고.txt");

        File file3 = new File("C:/java_study", "hello.txt");

    }

    public void makeFile(String path, String fileName) {
        File file = new File(path, fileName);

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteFile(String path, String fileName) {
        File file = new File(path, fileName);

        file.delete();
    }

    public void makeDirectory(String path) {
        File dir = new File(path);

        dir.mkdir();
    }

    public void deleteDirectory(String path) {
        File dir = new File(path);
        dir.delete();
    }

    public void printFileInformation(File file) throws Exception {
        // 파일의 존재 여부
        boolean exist = file.exists();
        System.out.printf("존재 여부 : %b\n", exist);

        // 파일, 디렉토리 구분
        if (file.isFile()) {
            System.out.println("파일");
        } else if (file.isDirectory()) {
            System.out.println("디렉토리");
        } else {
            System.out.println("모르겠어요");
        }

        // 파일의 크기
        long length = file.length();
        System.out.printf("크기 : %d(bytes)\n", length);

        // 파일의 절대 경로
        String absolutePath = file.getAbsolutePath();
        String canonicalPath = file.getCanonicalPath();
        System.out.printf("절대경로 : %s  %s\n", absolutePath, canonicalPath);

        // 파일의 이름
        String fileName = file.getName();
        System.out.printf("파일명 : %s\n", fileName);

        // 마지막으로 수정된 시각
        long lastModified = file.lastModified();
        Date date = new Date(lastModified);
        System.out.printf("마지막으로 수정된 시각 : %s\n", date.toString());

        if (file.isDirectory()) {
            // 디렉토리에 포함된 파일과 subdirectory 목록
            String[] list = file.list();
            File[] files = file.listFiles();

            System.out.println("자식들");
            for (String name : list) {
                System.out.printf("\t%s\n", name);
            }
        }

    }

    public void dir(File directory) {

    }


    public static void main(String[] args) throws Exception {
        FileClassStudy study = new FileClassStudy();
        study.basic();
        study.makeFile("C:/java_study", "abcd.txt");
        study.deleteFile("C:/java_study", "abcd.txt");
        study.makeDirectory("C:/java_study/2학년2반");
        study.deleteDirectory("C:/java_study/2학년2반");

        // C:/java_study/sample/room.jpg 파일을 만드세요.
        study.makeDirectory("C:/java_study/sample");
        study.makeFile("C:/java_study/sample", "room.jpg");
        study.deleteDirectory("C:/java_study/sample");  // 비어있지 않은 디렉토리는 삭제가 되지 않는다.

        File file1 = new File("C:/java_study/대소고.txt");
        File file2 = new File("C:/java_study/sample");

        study.printFileInformation(file2);


    }

}
