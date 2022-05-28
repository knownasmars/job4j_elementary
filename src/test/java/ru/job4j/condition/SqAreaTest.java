package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP4K1Then1() {
        double p = 4;
        double k = 1;
        double expected = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP6K2Then2() {
        double p = 6;
        double k = 2;
        double expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K4Then4() {
        double p = 10;
        double k = 4;
        double expected = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}