package kr.hs.dgsw.java.inherit2.polygon;

public abstract class Polygon {
    protected final String name;

    public Polygon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getArea();


}
