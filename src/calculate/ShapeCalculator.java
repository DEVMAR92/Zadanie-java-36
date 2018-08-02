package calculate;


import data.Ball;
import data.Circle;
import data.Cube;
import data.Rectangle;

public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {

    @Override
    public double circleArea(Circle circle) {
        return Math.PI * circle.getRadius() * circle.getRadius();
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        return rectangle.getFirstSide() * rectangle.getSecondSide();
    }

    @Override
    public double ballVolume(Ball ball) {
            return (4 * Math.PI * ball.getRadius() * ball.getRadius() * ball.getRadius()) / 3;
    }

    @Override
    public double cubeVolume(Cube cube) {
        return cube.getSide() * cube.getSide() * cube.getSide();
    }


}
