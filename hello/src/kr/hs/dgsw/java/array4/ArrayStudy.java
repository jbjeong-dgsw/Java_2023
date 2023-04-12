package kr.hs.dgsw.java.array4;

public class ArrayStudy {

    void study() {
        /* 배열의 선언 */
        int[] intArray = new int[5];
        int intArray2[] = new int[5];

        double[] doubleArray = new double[20];
        String[] strArray = new String[12];

        /* 읽고 쓰기 */
        intArray[2] = 7;
        strArray[4] = "Korea";

        System.out.println(strArray[4]);
        System.out.println(intArray[0] + "  " + strArray[0]);

        boolean[] booleanArray = new boolean[5];
        System.out.println(booleanArray[0]);
    }

    void studyInit() {
        int[] intArray = new int[] {5, 4, 8, 3, 1, 4};
        System.out.println(intArray[3] + intArray[2]);

        String[] colors = new String[] {
                "빨강", "노랑", "초록", "파랑", "보라"
        };

        int lengthOfColors = colors.length;

        for (int i = 0 ; i < colors.length ; i++) {
            System.out.printf("%d - %s\n", i, colors[i]);
        }

        for (String color : colors) {
            System.out.println(color);
        }

        intArray[6] = 12;
        intArray[-1] = 3;
    }

    public static void main(String[] args) {
        ArrayStudy study = new ArrayStudy();
        study.studyInit();
    }
}
