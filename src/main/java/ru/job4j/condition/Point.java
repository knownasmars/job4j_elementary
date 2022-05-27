package ru.job4j.condition;
//import java.lang.Math;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = -1;

        int difX = x2 - x1;
        int difY = y2 - y1;

        double powX = Math.pow(difX, 2);
        double powY = Math.pow(difY, 2);

        double powSum = powX + powY;
        rsl = Math.sqrt(powSum);

        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}