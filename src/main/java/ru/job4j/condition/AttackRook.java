package ru.job4j.condition;

public class AttackRook {
    public static boolean check(String left, String right) {
        char[] leftChar = left.toCharArray();
        char[] rightChar = right.toCharArray();
        for (int i = 0; i < 2; i++) {
            if (leftChar[i] == rightChar[i]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(check("А4", "Б3"));
    }
}