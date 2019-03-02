package lesson10;

import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        String text = "English children like Christmas. But they don't like english lesson. but But But";
        List<String> textList = Arrays.asList(text.split(" "));
        System.out.println(textList);
        int size = textList.size();

        Map<String, Integer> CountMap = new HashMap<>();
        for (int j = 0; size > j; j++) {
            int count = 0;
            for (int i = 0; size > i; i++) {
                if (textList.get(j).equals(textList.get(i))) {
                    count++;
                    CountMap.put(textList.get(j), count);
                }
            }
        }
        System.out.println(CountMap);
    }
}