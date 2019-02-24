package lesson9.Task2;

public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private double middleRating;

    public Student(String firstName, String lastName, int age, double middleRating) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.middleRating = middleRating;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getMiddleRating() {
        return middleRating;
    }

    @Override
    public String toString() {
        return "Студент: {" +
                "фамилия ='" + firstName + '\'' +
                ", имя ='" + lastName + '\'' +
                ", возраст =" + age + '\'' +
                ", средний балл =" + middleRating +
                '}' + '\n';
    }
}