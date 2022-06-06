package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[] {0, 12, 15, 22};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int exptected = -1;
        Assert.assertEquals(exptected, result);
    }

    @Test
    public void whenArrayHas3Then4() {
        int[] data = new int[] {0, 15, 22, 12, 3, 10};
        int el = 3;
        int result = FindLoop.indexOf(data, el);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }
}