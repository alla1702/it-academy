package lesson7.lesson7;

public class Ellipse extends Figure implements AreaPerimeterFigure {

    public Ellipse(double a, double b) {
        super(a, b);
    }

    @Override
    public double getAreaFigure() {
        return Math.PI * Math.abs(getA()) * Math.abs(getB());
    }

    @Override
    public double getPerimeterFigure() {
        return 2 * Math.PI * Math.sqrt(0.5 * (getA() * getA() + getB() * getB()));
    }

    @Override
    public String toString() {
        return "Эллипс: " +
                "сторона a = " + Math.abs(super.getA()) +
                "; сторона b = " + Math.abs(super.getB());
    }
}