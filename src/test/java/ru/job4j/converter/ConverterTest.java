package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert120RblThen2Dlrs() {
        float in = 120;
        float expected = 2;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert20DlrsThen1200Rbl() {
        float in = 20;
        float expected = 1200;
        float out = Converter.dollarToRuble(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert15EuroThen1050Rbl() {
        float in = 15;
        float expected = 1050;
        float out = Converter.euroToRuble(15);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}