package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float euro = value / 70;
        return euro;
    }

    public static float rubleToDollar(float value) {
        float dollar = value / 60;
        return dollar;
    }

    public static float dollarToRuble(float value) {
        float rubleFromDollar = value * 60;
        return rubleFromDollar;
    }

    public static float euroToRuble(float value) {
        float rubleFromEuro = value * 70;
        return rubleFromEuro;
    }

    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;

        float dollar = Converter.rubleToDollar(120);
        float in2 = 120;
        float expected2 = 2;
        float out2 = Converter.rubleToDollar(120);
        boolean passed2 = expected2 == out2;

        float rubleFromDollar = Converter.dollarToRuble(20);
        float in3 = 20;
        float expected3 = 1200;
        float out3 = Converter.dollarToRuble(20);
        boolean passed3 = expected3 == out3;

        float rubleFromEuro = Converter.euroToRuble(15);
        float in4 = 15;
        float expected4 = 1050;
        float out4 = Converter.euroToRuble(15);
        boolean passed4 = expected4 == out4;

        System.out.println("140 rubles are " + euro + " 2 euros. Test result: " + passed);
        System.out.println("120 rubles are " + dollar + " 2 dollars. Test result: " + passed2);
        System.out.println("20 dollars are " + rubleFromDollar + " rubles. Test result: " + passed3);
        System.out.println("15 euros are " + rubleFromEuro + " rubles. Test result: " + passed4);
    }
}