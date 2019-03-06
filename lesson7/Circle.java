package lesson7.lesson7;

public class Circle implements AreaPerimeterFigure {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getAreaFigure() {
        double S = Math.PI * Math.abs(getR()) * Math.abs(getR());
        return S;
    }

    @Override
    public double getPerimeterFigure() {
        return 2 * Math.PI * Math.abs(getR());
    }

    @Override
    public String toString() {
        return "Круг: " +
                "радиус r = " + Math.abs(getR());
    }
}