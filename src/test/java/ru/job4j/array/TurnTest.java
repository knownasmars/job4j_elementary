package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void when123then321() {
        int[] array = new int[]{1, 2, 3};
        int[] expected = new int[]{3, 2, 1};
        int[] result = Turn.back(array);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when1234then4321() {
        int[] array = new int[]{1, 2, 3, 4};
        int[] expected = new int[]{4, 3, 2, 1};
        int[] result = Turn.back(array);
        Assert.assertArrayEquals(expected, result);
    }
}