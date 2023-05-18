package kr.hs.dgsw.java.list4;

import java.util.ArrayList;
import java.util.List;

public class ListStudy {

    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();

        colors.size();

        colors.add(0, "하양");

        colors.add("빨강");
        colors.add("노랑");


        String color = colors.get(0);
        System.out.println(color);

        colors.add(1, "파랑");
        System.out.println(colors.get(1));
        //System.out.println(colors.get(3));

    }


}
