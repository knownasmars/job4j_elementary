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

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        float rubleFromDollar = Converter.dollarToRuble(20);
        float rubleFromEuro = Converter.euroToRuble(15);

        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollars.");
        System.out.println("20 dollars are " + rubleFromDollar + " rubles.");
        System.out.println("15 euros are " + rubleFromEuro + " rubles.");
    }
}