package lesson7.lesson7;

public class Parallelogram extends Figure implements AreaPerimeterFigure, Height {

    private double alfa;

    public Parallelogram(double a, double b, double alfa) {
        super(a, b);
        this.alfa = alfa;
    }

    public double getAlfa() {
        return alfa;
    }

    public void setAlfa(double alfa) {
        this.alfa = alfa;
    }

    @Override
    public double getAreaFigure() {
        return Math.abs(getA()) * Math.abs(getB()) * Math.abs(Math.sin(Math.toRadians(getAlfa())));
    }

    @Override
    public double getPerimeterFigure() {
        return 2 * getA() + 2 * getB();
    }

    @Override
    public double getHeight() {
        return getAreaFigure() / getB();
    }

    @Override
    public String toString() {
        return "Параллелограмм: " +
                "сторона a = " + Math.abs(super.getA()) +
                "; сторона b = " + Math.abs(super.getB()) +
                "; угол alfa (в градусах) = " + getAlfa();
    }
}