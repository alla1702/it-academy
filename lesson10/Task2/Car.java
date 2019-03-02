package lesson10.Task2;

import java.util.Objects;

public abstract class Car {

    private int carNumber;
    private String carBrand;
    private String model;
    private int maxSpeed;
    private int yearOfIssue;

    public Car(int carNumber, String carBrand, String model, int maxSpeed, int yearOfIssue) {
        this.carNumber = carNumber;
        this.carBrand = carBrand;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfIssue = yearOfIssue;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (carNumber != car.carNumber) return false;
        if (!Objects.equals(carBrand, car.carBrand)) return false;
        return Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        int result = carNumber;
        result = 31 * result + (carBrand != null ? carBrand.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        return result;
    }
}