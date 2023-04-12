package kr.hs.dgsw.java.array2;

public class ArrayStudy {

    void study() {
        /* 배열의 선언 */
        double[] doubleArray = new double[100];
        String[] strArray = new String[20];
        boolean[] boolArry = new boolean[5];
        char[] charArray = new char[5];

        /* 값을 읽고 쓰기 */
        strArray[2] = "Lion";
        strArray[5] = "Rabbit";
        doubleArray[0] = 3.14;

        String str = null;
        str = strArray[5];

        System.out.println(strArray[3]);
        System.out.println(strArray[2]);
        System.out.println(doubleArray[1]);
        System.out.println(boolArry[0]);
        System.out.println(charArray[0] + "  " + (int)charArray[0]);
    }

    void studyInit() {
        /* 배열을 선언하면서 동시에 초기화하기 */
        int[] values = new int[] {5, 4, 9, 3, 1, 7};

        System.out.println(values[0] + "  " + values[1]);

        /* 배열의 길이를 알기 위해서 length 속성을 사용한다. */
        int lengthOfArray = values.length;
        System.out.printf("배열의 길이 : %d\n", lengthOfArray);

        for (int i = 0 ; i < values.length ; i++) {
            System.out.printf("%d - %d\n", i, values[i]);
        }

        for (int value : values) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        ArrayStudy study = new ArrayStudy();
        study.studyInit();
    }
}
