/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex38Tests;

import ex38.ValueFilterer;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ValueFiltererTest
{
    ValueFilterer valueFilterer = new ValueFilterer();

    @Test
    public void filterEvenNumbers_shouldReturnExpected()
    {
        final int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 14141541, 8 };
        final int[] expected = new int[] { 2,4,6,8 };

        int[] actual = valueFilterer.filterEvenNumbers(numbers);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void getEvenNumberArrayLength_shouldReturnExpected()
    {
        final int[] numbers = new int[] { 1, 2, 3, 4, 5, 6 };
        int actual = valueFilterer.getEvenNumberArrayLength(numbers);
        assertEquals(3, actual);
    }

    @Test
    public void convertNumberStringToArray_shouldReturnExpected()
    {
        final int[] expected = new int[] { 1, 2, 3, 4, 5, 6 };
        final String numberString = "1 2 3 4 5 6";
        int[] actual = valueFilterer.convertNumberStringToArray(numberString);
        assertArrayEquals(expected, actual);
    }
}
