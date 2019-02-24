package lesson9.Task2;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        Student potapov = new Student("Потапов", "Егор", 23, 7.6);
        Student petrov = new Student("Петров", "Николай", 20, 8.2);
        Student letvinova = new Student("Летвинова", "Анастасия", 19, 8.2);
        Student ivanovN = new Student("Иванов", "Алексей", 22, 5.3);
        Student ivanovA = new Student("Иванов", "Алексей", 22, 5.4);

        List<Student> students = new ArrayList<>();
        students.add(potapov);
        students.add(petrov);
        students.add(letvinova);
        students.add(ivanovN);
        students.add(ivanovA);

        students.sort(new StudentFirstNameComparator().thenComparing(new StudentLastNameComparator().thenComparing(new AgeComparator().thenComparing(new MiddleRatingComparator()))));

        System.out.println(students);

        if (!students.isEmpty()) {
            Student result = students.get(0);
            for (Student currentStudent : students) {
                if (currentStudent.getMiddleRating() >= result.getMiddleRating()) {
                    result = currentStudent;
                }
            }
            System.out.println(result);
        }
    }
}
