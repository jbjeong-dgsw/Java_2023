package kr.hs.dgsw.java.inherit2.polygon;

public class Rectangle extends Polygon {
    protected final double width;

    protected final double height;

    public Rectangle(double width, double height) {
        super("직사각형");
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Polygon rect1 = new Rectangle(15, 8);
        System.out.printf("%s의 면적 : %f \n",
                rect1.getName(), rect1.getArea());


    }
}
