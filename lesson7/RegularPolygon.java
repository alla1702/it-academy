package lesson7.lesson7;

public class RegularPolygon extends Figure implements AreaPerimeterFigure {

    private int n;

    public RegularPolygon(double a, int n) {
        super(a);
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public double getAreaFigure() {
        return Math.abs(getN()) * getA() * getA() / (4 * Math.tan(Math.toRadians(360 / (2 * Math.abs(getN())))));
    }

    @Override
    public double getPerimeterFigure() {
        return Math.abs(getA()) * Math.abs(getN());
    }

    @Override
    public String toString() {
        return "Правильный многоугольник: " +
                "сторона a = " + Math.abs(super.getA()) +
                "; число вершин n = " + Math.abs(getN());
    }
}