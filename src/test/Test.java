package test;


import data.*;
import calculate.*;

public class Test {

    public static void main(String[] args) {


        Shape line2D = new Line2D(3,4,50,60);


        Shape circle = new Circle(20);
        Shape rectangle = new Rectangle(30,20);

        Shape ball = new Ball(12);
        Shape cube = new Cube(33);

        ShapeCalculator calculator = new ShapeCalculator();

        line2D.show();
        double lineResult = calculator.lineLenght((Line2D) line2D);
        System.out.println("Długość lini: " + lineResult);

        circle.show();
        double circleResult = calculator.circleArea((Circle) circle);
        System.out.println("Pole koła: " + circleResult);

        rectangle.show();
        double rectangleResult = calculator.rectangleArea((Rectangle) rectangle);
        System.out.println("Pole prostokąta: " + rectangleResult);

        ball.show();
        double ballResult = calculator.ballVolume((Ball) ball);
        System.out.println("Pojemność kuli: " + ballResult);

        cube.show();
        double cubeResult = calculator.cubeVolume((Cube) cube);
        System.out.println("Pojemność sześcianu: " + cubeResult);

    }
}
