package data;

public abstract class GeometricShape extends Shape2D {

    @Override
    public void show() {
        super.show();
        System.out.println("Figura geometryczna");
    }
}
