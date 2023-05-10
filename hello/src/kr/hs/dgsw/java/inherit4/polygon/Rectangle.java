package kr.hs.dgsw.java.inherit4.polygon;

public class Rectangle extends Polygon {

    protected final double width;

    protected final double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getSize() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle("직사각형", 11, 7);
        double size = rect.getSize();
        System.out.println(size);
    }
}
