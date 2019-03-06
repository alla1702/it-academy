package lesson7.lesson7;

public class Triangle extends Figure implements AreaPerimeterFigure, Height {

    private double c;

    public Triangle(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double getAreaFigure() {
        double p = 0.5 * (Math.abs(getA()) + Math.abs(getB()) + Math.abs(getC()));
        return Math.sqrt(p * (p - Math.abs(getA())) * (p - Math.abs(getB())) * (p - Math.abs(getC())));
    }

    @Override
    public double getPerimeterFigure() {
        return Math.abs(getA()) + Math.abs(getB()) + Math.abs(getC());
    }

    @Override
    public double getHeight() {
        return 2 * getAreaFigure() / Math.abs(getB());
    }

    @Override
    public String toString() {
        return "Треугольник: " +
                "сторона a = " + Math.abs(super.getA()) +
                "; сторона b = " + Math.abs(super.getB()) +
                "; сторона c = " + Math.abs(c);
    }
}