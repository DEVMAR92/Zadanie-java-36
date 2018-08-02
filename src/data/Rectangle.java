package data;

import data.GeometricShape;

public class Rectangle extends GeometricShape {

    private double firstSide;
    private double secondSide;

    public Rectangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Prostokąt");
        System.out.println("Pierwszy bok: " + firstSide + ", drugi bok: " + secondSide);
    }
}
