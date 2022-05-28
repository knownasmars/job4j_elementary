package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.converter.Converter;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman168Then66dot7() {
        short in = 168;
        double expected = 66.7;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}