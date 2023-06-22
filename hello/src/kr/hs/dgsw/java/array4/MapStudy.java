package kr.hs.dgsw.java.array4;

import java.util.*;

public class MapStudy {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        Map<Integer, String> map = new HashMap<>();

        map.put(2401, "김수인");
        map.put(2412, "이경민");
        map.put(2405, "김종윤");

        String name = map.get(2401);
        name = map.get(2402);

        System.out.println(name);

        map.put(2412, "윤석규");

        name = map.remove(2405);

        // map에 속한 key의 목록
        Set<Integer> keys = map.keySet();

        System.out.println("Keys ---------");

        for (Integer key : keys) {
            System.out.println("\t" + key);
        }

        Collection<String> values = map.values();
    }

    public static List<String> getValues(Map<Integer, String> map) {
        return null;
    }

}
