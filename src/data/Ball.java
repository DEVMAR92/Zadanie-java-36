package data;

public class Ball extends Shape3D {
    private double radius;

    public Ball(double radius) {
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
        System.out.println("Kula");
        System.out.println("Promień: " +radius);
    }
}
