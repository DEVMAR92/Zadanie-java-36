package data;

public class Line2D extends Shape2D {

    private double startPointX;
    private double startPointY;
    private double endPointX;
    private double endPointY;

    public Line2D(double startPointX, double startPointY, double endPointX, double endPointY) {
        this.startPointX = startPointX;
        this.startPointY = startPointY;
        this.endPointX = endPointX;
        this.endPointY = endPointY;
    }

    public double getStartPointX() {
        return startPointX;
    }

    public void setStartPointX(double startPointX) {
        this.startPointX = startPointX;
    }

    public double getStartPointY() {
        return startPointY;
    }

    public void setStartPointY(double startPointY) {
        this.startPointY = startPointY;
    }

    public double getEndPointX() {
        return endPointX;
    }

    public void setEndPointX(double endPointX) {
        this.endPointX = endPointX;
    }

    public double getEndPointY() {
        return endPointY;
    }

    public void setEndPointY(double endPointY) {
        this.endPointY = endPointY;
    }


    @Override
    public void show() {
        super.show();
        System.out.println("Linia");
        System.out.println("Punkt początkowy (" + startPointX + ", " + startPointY + ")");
        System.out.println("Punkt końcowy (" + endPointX + ", " + endPointY + ")");
    }

}
