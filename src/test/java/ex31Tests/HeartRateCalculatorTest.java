/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex31Tests;

import ex31.HeartRateCalculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HeartRateCalculatorTest
{
    @Test
    public void generateHeartRateTable_shouldReturnExpected()
    {
        final int restingPulse = 71;
        final int age = 72;
        final String expectedHeartRateTable =
            "Intensity\t\t| Rate\n" +
            "----------------|--------\n" +
            "55 %\t\t\t| 113 bpm\n" +
            "60 %\t\t\t| 117 bpm\n" +
            "65 %\t\t\t| 121 bpm\n" +
            "70 %\t\t\t| 125 bpm\n" +
            "75 %\t\t\t| 129 bpm\n" +
            "80 %\t\t\t| 133 bpm\n" +
            "85 %\t\t\t| 136 bpm\n" +
            "90 %\t\t\t| 140 bpm\n" +
            "95 %\t\t\t| 144 bpm\n";

        HeartRateCalculator heartRateCalculator = new HeartRateCalculator();
        String actualHeartRateTable = heartRateCalculator.generateHeartRateTable(restingPulse, age);
        assertEquals(expectedHeartRateTable, actualHeartRateTable);
    }

    @Test
    public void calculateBpm_shouldReturnExpected1()
    {
        final int age = 22;
        final int restingPulse = 65;
        final int heartRateRangeStart = 55;
        final int expectedBpm = 138;

        HeartRateCalculator heartRateCalculator = new HeartRateCalculator();
        int actualBpm = heartRateCalculator.calculateBpm(heartRateRangeStart, age, restingPulse);
        assertEquals(expectedBpm, actualBpm);
    }

    @Test
    public void calculateBpm_shouldReturnExpected2()
    {
        final int restingPulse = 71;
        final int age = 72;
        final int heartRateRange = 75;
        final int expectedBpm = 129;

        HeartRateCalculator app = new HeartRateCalculator();
        int actualBpm = app.calculateBpm(heartRateRange, age, restingPulse);
        assertEquals(expectedBpm, actualBpm);
    }
}
