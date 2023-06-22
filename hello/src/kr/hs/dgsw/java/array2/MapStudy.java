package kr.hs.dgsw.java.array2;

import java.util.*;

public class MapStudy {

    public static void main(String[] args) {

        List<String> students = new ArrayList<>();

        Map<Integer, String> studentMap = new HashMap<>();

        students.add("김경민");
        students.add("전해림");

        studentMap.put(2201, "김경민");
        studentMap.put(2202, "전해림");
        studentMap.put(2215, "이재명");
        studentMap.put(2208, "김지운");
        studentMap.put(2212, "양시영");

        String name = studentMap.get(2201);
        System.out.println(name);

        name = studentMap.get(2203);
        System.out.println(name);

        // 키 목록
        System.out.println("Keys  ----------- ");
        Set<Integer> keys = studentMap.keySet();
        for (Integer key : keys) {
            System.out.printf("%d - %s\n", key,
                    studentMap.get(key));
        }

        // 값(value)의 목록
        Collection<String> values =
                studentMap.values();
        System.out.println("Values   ---------- ");
        for (String value : values) {
            System.out.printf("\t%s\n", value);
        }

        // 삭제
        name = studentMap.remove(2201);
    }


}
