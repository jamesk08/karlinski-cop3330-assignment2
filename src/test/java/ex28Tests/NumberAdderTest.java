/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex28Tests;

import ex28.NumberAdder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberAdderTest
{
    @Test
    public void sumNumberInputs_shouldReturnExpected()
    {
        final int MAX_INPUT_COUNT = 5;
        int[] fakeNumberInputs = new int[]{1, 2, 3, 4, 5};
        final int expected = 15;

        NumberAdder numberAdder = new NumberAdder(MAX_INPUT_COUNT);
        int actual = numberAdder.sumNumberInputs(fakeNumberInputs);
        assertEquals(expected, actual);
    }
}
