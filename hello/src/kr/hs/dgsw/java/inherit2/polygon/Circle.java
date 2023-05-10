package kr.hs.dgsw.java.inherit2.polygon;

public class Circle extends Polygon{
    protected final double radius;

    public Circle(double radius){
        super("원");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * (radius * radius);
    }

    public static void main(String[] args) {
        Circle cir = new Circle(7);
        System.out.printf("%s의 면적은 %f입니다",
                cir.getName(), cir.getArea());
    }
}
