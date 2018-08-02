package data;

public class Circle extends GeometricShape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Koło");
        System.out.println("Promień: " + radius);
    }

}
