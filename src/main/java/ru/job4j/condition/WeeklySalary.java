package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int salary = 0;
        for (int i = 0; i < 5; i++) {
            if (hours[i] > 8) {
                salary = salary + 8 * 10 + (hours[i] - 8) * 15;
            } else {
                salary = salary + hours[i] * 10;
            }
        }
        for (int i = hours.length - 2; i < hours.length; i++) {
            if (hours[i] > 8) {
                salary = salary + 2 * (8 * 10)  + (hours[i] - 8) * 15 * 2;
            } else {
                salary = salary + 2 * (hours[i] * 10);
            }
        }
        return salary;
    }

    public static void main(String[] args) {
        int[] hours = new int[]{8, 8, 0, 6, 0, 4, 5};
        System.out.println(calculate(hours));
    }
}