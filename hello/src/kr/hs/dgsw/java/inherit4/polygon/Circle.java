package kr.hs.dgsw.java.inherit4.polygon;

import com.sun.xml.internal.ws.encoding.MtomCodec;

public class Circle extends Polygon{

    protected final double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getSize() {
        return radius * radius * Math.PI;
    }

    public static void main(String[] args) {
        Polygon circle = new Circle("원", 5);
        double size = circle.getSize();
        System.out.println(size);
    }

}
