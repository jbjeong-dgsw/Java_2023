package kr.hs.dgsw.java.inherit4.polygon;

import kr.hs.dgsw.java.inherit2.polygon.Pentagon;

public abstract class Polygon {
    protected final String name;

    public Polygon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getSize();
}
