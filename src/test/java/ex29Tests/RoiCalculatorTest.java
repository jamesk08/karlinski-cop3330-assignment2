/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex29Tests;

import ex29.RoiCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoiCalculatorTest
{
    @Test
    public void getNumberOfYearsToDouble_shouldReturnValidResult()
    {
        final int returnRate = 4;
        final int expectedYears = 18;
        RoiCalculator roiCalculator = new RoiCalculator();
        int actualYears = roiCalculator.getNumberOfYearsToDouble(returnRate);
        assertEquals(expectedYears, actualYears);
    }
}
