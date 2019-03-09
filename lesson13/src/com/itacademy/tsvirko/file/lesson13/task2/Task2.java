package com.itacademy.tsvirko.file.lesson13.task2;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) throws IOException {
        createFile();
    }

    public static void createFile() throws IOException {
        Path writePath = Paths.get("resources", "Task2New.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(writePath.toFile()));
        int[] array = getArray();
        Arrays.sort(array);
        for (int number : array) {
            bufferedWriter.write(number + "\n");
            bufferedWriter.flush();
            System.out.print(number + " ");
        }
    }

    public static int[] getArray() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String value = bufferedReader.readLine();
        String[] valueSplit = value.split(" ");
        int[] array = new int[valueSplit.length];
        for (int i = 0; i < valueSplit.length; i++) {
            array[i] = Integer.parseInt(valueSplit[i]);
        }
        return array;
    }
}