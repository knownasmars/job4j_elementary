package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        int start = 0;
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, start, data.length - 1);
            int index = FindLoop.indexInRange(data, min, start, data.length - 1);
            SwitchArray.swap(data, index, start);
            start++;
        }
        return data;
    }
}
