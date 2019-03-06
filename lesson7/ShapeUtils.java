package lesson7.lesson7;

public class ShapeUtils {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 4, 3);
        Rectangle rectangle = new Rectangle(1, 2);
        Parallelogram parallelogram = new Parallelogram(4, 3, 45);
        Circle circle = new Circle(56);
        Ellipse ellipse = new Ellipse(4, 3);
        RegularPolygon regularPolygon = new RegularPolygon(5, 5);

        printArea(triangle, rectangle, parallelogram, circle, ellipse, regularPolygon);
        System.out.println(isRectangle(rectangle));
        System.out.println(isRectangle(parallelogram));

        System.out.println(isTriangle(rectangle));
        System.out.println(isTriangle(triangle));
    }

    public static void printArea(Triangle triangle, Rectangle rectangle, Parallelogram parallelogram,
                                 Circle circle, Ellipse ellipse, RegularPolygon regularPolygon) {
        System.out.println(triangle.toString());
        System.out.println("Площадь треугольника: " + triangle.getAreaFigure());
        System.out.println("Периметр треугольника: " + triangle.getPerimeterFigure());
        System.out.println("Высота треугольника: " + triangle.getHeight());
        System.out.println();
        System.out.println(rectangle.toString());
        System.out.println("Площадь прямоугольника: " + rectangle.getAreaFigure());
        System.out.println("Длина прямоугольника: " + rectangle.getPerimeterFigure());
        System.out.println();
        System.out.println(parallelogram.toString());
        System.out.println("Площадь параллелограмма: " + parallelogram.getAreaFigure());
        System.out.println("Периметр параллелограмма: " + parallelogram.getPerimeterFigure());
        System.out.println("Высота параллелограмма: " + parallelogram.getHeight());
        System.out.println();
        System.out.println(circle.toString());
        System.out.println("Площадь круга: " + circle.getAreaFigure());
        System.out.println("Длина окружности: " + circle.getPerimeterFigure());
        System.out.println();
        System.out.println(ellipse.toString());
        System.out.println("Площадь эллипса: " + ellipse.getAreaFigure());
        System.out.println("Длина эллипса: " + ellipse.getPerimeterFigure());
        System.out.println();
        System.out.println(regularPolygon.toString());
        System.out.println("Площадь правильного многоугольника: " + regularPolygon.getAreaFigure());
        System.out.println("Длина правильного многоугольника: " + regularPolygon.getPerimeterFigure());
    }

    public static boolean isRectangle(Figure figure) {
        if (figure instanceof Rectangle) {
            return true;
        } else return false;
    }

    public static boolean isTriangle(Figure figure) {
        if (figure instanceof Triangle) {
            return true;
        } else return false;
    }
}