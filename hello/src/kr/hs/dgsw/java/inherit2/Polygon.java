package kr.hs.dgsw.java.inherit2;

import java.util.Date;
import java.util.Scanner;

public class Polygon {
    private int countOfLines;

    private String name;

    @Override
    public String toString() {
        return this.name + " : " + this.countOfLines;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Polygon)) {
            return false;
        }

        Polygon compared = (Polygon)obj;
        return countOfLines == compared.countOfLines;
    }

    public static void main(String[] args) {
        Polygon polygon = new Polygon();
        polygon.countOfLines = 3;
        polygon.name = "삼각형";

        Polygon polygon1 = new Polygon();
        polygon1.countOfLines = 4;
        polygon1.name = "사각형";

        Polygon polygon2 = polygon;

        Polygon polygon3 = new Polygon();
        polygon3.countOfLines = 3;
        polygon3.name = "삼각형";

        System.out.printf("polygon.equals(polygon1) : %b \n",
                polygon.equals(polygon1));
        System.out.printf("polygon.equals(polygon2) : %b \n",
                polygon.equals(polygon2));
        System.out.printf("polygon.equals(polygon3) : %b \n",
                polygon.equals(polygon3));


        Object object = new Object();
        String str = new String("String");
        Date date = new Date();
        Scanner scanner = new Scanner(System.in);

        System.out.println(polygon.toString());
        System.out.println(polygon1);

        System.out.println(object.toString());
        System.out.println(str.toString());
        System.out.println(date.toString());
        System.out.println(scanner.toString());
    }
}
