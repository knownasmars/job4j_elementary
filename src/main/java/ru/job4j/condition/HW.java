package ru.job4j.condition;

public class HW {
    @SuppressWarnings("checkstyle:NeedBraces")
    public static String checkNumber(int number) {
        String result;
        boolean three = number % 3 == 0;
        boolean five = number % 5 == 0;
        if (five && three) result = "Hello, World!!!";
        else if (five) result = "World";
        else if (three) result = "Hello";
        else result = "Operation not support";
        return result;
    }

    public static void main(String[] args) {
        System.out.println(checkNumber(5));
        System.out.println(checkNumber(3));
        System.out.println(checkNumber(4));
        System.out.println(checkNumber(30));
    }
}