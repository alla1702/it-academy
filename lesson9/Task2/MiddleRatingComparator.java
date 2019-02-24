package lesson9.Task2;

import java.util.Comparator;

public class MiddleRatingComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getMiddleRating(), o2.getMiddleRating());
    }
}