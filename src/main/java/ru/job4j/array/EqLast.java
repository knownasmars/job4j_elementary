package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
            if (right[right.length - 1] == left[left.length - 1]) {
                return true;
            }
        return false;
    }
}