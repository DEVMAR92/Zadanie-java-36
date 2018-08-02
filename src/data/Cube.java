package data;

public class Cube extends Shape3D {

    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Sześcian");
        System.out.println("Bok: " + side);
    }
}
