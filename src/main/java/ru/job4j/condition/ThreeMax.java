package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (second >= first && first >= third) {
            result = second;
        }
        if (first <= second && second <= third) {
            result = third;
        }
        return result;
    }
}