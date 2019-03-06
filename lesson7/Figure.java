package lesson7.lesson7;

public abstract class Figure {

    private double a;
    private double b;

    public Figure(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Figure(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}