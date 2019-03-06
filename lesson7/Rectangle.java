package lesson7.lesson7;

public class Rectangle extends Figure implements AreaPerimeterFigure {

    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double getAreaFigure() {
        return Math.abs(getA()) * Math.abs(getB());
    }

    @Override
    public double getPerimeterFigure() {
        return 2 * (Math.abs(getA()) + Math.abs(getB()));
    }

    @Override
    public String toString() {
        return "Прямоугольник: " +
                "сторона a = " + Math.abs(super.getA()) +
                "; сторона b = " + Math.abs(super.getB());
    }
}