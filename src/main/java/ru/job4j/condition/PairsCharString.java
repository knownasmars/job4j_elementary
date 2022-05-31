package ru.job4j.condition;

public class PairsCharString {
    public static boolean check(String l, String r) {
        char[] larr = l.toCharArray();
        char[] rarr = r.toCharArray();
        if (l == "" && r == "") {
            return true;
        } else if ((larr[0] == rarr[rarr.length - 1])
                && larr[larr.length - 1] == rarr[0]) {
            return true;
        } else {
            return false;
        }
    }
}