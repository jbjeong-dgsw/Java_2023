package kr.hs.dgsw.java.inherit2.polygon;

public class Triangle extends Polygon {
    protected final double width;

    protected final double height;

    public Triangle(double width, double height) {
        super("삼각형");
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height / 2.0;
    }

    public static void main(String[] args) {
        Polygon tri = new Triangle(7, 5);
        System.out.printf("%s의 면적 : %f\n",
                tri.getName(), tri.getArea());
    }
}
