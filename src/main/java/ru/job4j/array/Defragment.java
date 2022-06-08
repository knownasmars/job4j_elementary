package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 1; index < array.length; index++) {
            if (array[index - 1] == null) {
                for (int i = index; i < array.length; i++) {
                    if (array[i] != null) {
                        array[index - 1] = array[i];
                        array[i] = null;
                        break;
                    }
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}