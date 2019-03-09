package com.itacademy.tsvirko.file.lesson13.task1;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Task1 {

    public static void main(String[] args) throws IOException {
        Map<Character, Integer> characters = new TreeMap<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("C:/Users/acer pc/IdeaProjects/untitled1/resources/task1.txt"), "utf-8");
            while (scanner.hasNext()) {
                char[] line = scanner.nextLine().toLowerCase().toCharArray();
                for (Character character : line) {
                    if (Character.isLetter(character)) {
                        if (characters.containsKey(character)) {
                            characters.put(character, characters.get(character) + 1);
                        } else {
                            characters.put(character, 1);
                        }
                    }
                }
            }
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        if (!characters.isEmpty()) {
            Path writePath = Paths.get("resources", "Task1New.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(writePath.toFile()));
            for (Map.Entry<Character, Integer> entry : characters.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
                bufferedWriter.write(entry.getKey() + "-" + entry.getValue() + "\n");
                bufferedWriter.flush();
            }
        }
    }
}