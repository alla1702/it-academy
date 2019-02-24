package lesson9;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Task1 {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("is");
        list.add("this");
        list.add("lots");
        list.add("of");
        list.add("fun");
        list.add("for");
        list.add("every");
        list.add("Java");
        list.add("programmer");

        markLenght4(list);
        Collections.reverse(list);
        System.out.println(list);
    }

    public static void markLenght4(List<String> list) {
        list.sort(String::compareToIgnoreCase);
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().length() == 4) {
                listIterator.add("****");
            }
        }
    }
}