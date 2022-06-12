package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int first, int second, int third) {
        int max = max(second, third);
        return first > max ? first : max;
    }

    public static int max(int first, int second, int third, int fourth) {
        int max = max(second, third, fourth);
        return first > max ? first : max;
    }
}