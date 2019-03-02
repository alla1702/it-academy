package lesson10.Task2;

public class Toyota extends Car {

    private int numberDoors;

    public Toyota(int carNumber, String carBrand, String model, int maxSpeed, int yearOfIssue, int numberDoors) {
        super(carNumber, carBrand, model, maxSpeed, yearOfIssue);
        this.numberDoors = numberDoors;
    }

    public int getNumberDoors() {
        return numberDoors;
    }

    public void setNumberDoors(int numberDoors) {
        this.numberDoors = numberDoors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Toyota)) return false;
        if (!super.equals(o)) return false;

        Toyota toyota = (Toyota) o;

        return numberDoors == toyota.numberDoors;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numberDoors;
        return result;
    }

    @Override
    public String toString() {
        return "марка авто = " + super.getCarBrand() + '\'' +
                ", номер = " + super.getCarNumber() + '\'' +
                ", модель = " + super.getModel() + '\'' +
                ", max скорость = " + super.getMaxSpeed() + '\'' +
                ", год выпуска = " + super.getYearOfIssue() + '\'' +
                ", количество дверей = " + numberDoors + '\'' +
                '}' + '\n';
    }
}