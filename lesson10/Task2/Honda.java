package lesson10.Task2;

import java.util.Objects;

public class Honda extends Car {

    private String color;

    public Honda(int carNumber, String carBrand, String model, int maxSpeed, int yearOfIssue, String color) {
        super(carNumber, carBrand, model, maxSpeed, yearOfIssue);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Honda)) return false;
        if (!super.equals(o)) return false;

        Honda honda = (Honda) o;

        return Objects.equals(color, honda.color);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "марка авто = " + super.getCarBrand() + '\'' +
                ", номер = " + super.getCarNumber() + '\'' +
                ", модель = " + super.getModel() + '\'' +
                ", max скорость = " + super.getMaxSpeed() + '\'' +
                ", год выпуска = " + super.getYearOfIssue() + '\'' +
                ", цвет кузова = " + color + '\'' +
                '}' + '\n';
    }
}