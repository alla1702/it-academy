package lesson10.Task2;

import java.util.Objects;

public class Mercedes extends Car {

    private String typeCar;

    public Mercedes(int carNumber, String carBrand, String model, int maxSpeed, int yearOfIssue, String typeCar) {
        super(carNumber, carBrand, model, maxSpeed, yearOfIssue);
        this.typeCar = typeCar;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mercedes)) return false;
        if (!super.equals(o)) return false;

        Mercedes mercedes = (Mercedes) o;

        return Objects.equals(typeCar, mercedes.typeCar);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (typeCar != null ? typeCar.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "марка авто = " + super.getCarBrand() + '\'' +
                ", номер = " + super.getCarNumber() + '\'' +
                ", модель = " + super.getModel() + '\'' +
                ", max скорость = " + super.getMaxSpeed() + '\'' +
                ", год выпуска = " + super.getYearOfIssue() + '\'' +
                ", тип кузова = " + typeCar + '\'' +
                '}' + '\n';
    }
}