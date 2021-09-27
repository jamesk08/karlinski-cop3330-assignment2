/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex36Tests;

import ex36.StatisticsComputer;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StatisticsComputerTests
{
    StatisticsComputer statisticsComputer = new StatisticsComputer();

    public StatisticsComputerTests()
    {
        statisticsComputer.usersNumbers.add(100.0);
        statisticsComputer.usersNumbers.add(200.0);
        statisticsComputer.usersNumbers.add(1000.0);
        statisticsComputer.usersNumbers.add(300.0);
    }

    @Test
    public void displayEnteredNumbers_shouldDisplayExpectedValues()
    {
        final String expected =
            "Numbers: 100, 200, 1000, 300\n";

        String actual = statisticsComputer.displayEnteredNumbers();
        assertEquals(expected, actual);
    }

    @Test
    public void calculateStandardDeviation_shouldReturnExpected()
    {
        final double expected = 353.5533905932738;
        double actual = statisticsComputer.calculateStandardDeviation();
        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void calculateAverage_shouldReturnExpected()
    {
        final double expected = 400.0;
        double actual = statisticsComputer.calculateAverage();
        assertEquals(expected, actual, 0.0);

    }

    @Test
    public void findMinimum_shouldReturnExpected()
    {
        final double expected = 100.0;
        double actual = statisticsComputer.findMinimum();
        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void findMaximum_shouldReturnExpected()
    {
        final double expected = 1000.0;
        double actual = statisticsComputer.findMaximum();
        assertEquals(expected, actual, 0.0);
    }
}
