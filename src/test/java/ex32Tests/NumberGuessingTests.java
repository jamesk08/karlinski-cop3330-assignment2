/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex32Tests;

import ex32.DifficultyLevel;
import ex32.NumberGuessing;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class NumberGuessingTests {
    final int EASY_HIGH_END_RANGE = 10;
    final int MEDIUM_HIGH_END_RANGE = 100;
    final int DIFFICULT_HIGH_END_RANGE = 1000;

    @Test
    public void getMaxRange_shouldReturnEasyLevelMaxRange() {
        NumberGuessing numberGuessing = new NumberGuessing();
        int actualDifficultyMaxRange = numberGuessing.getMaxRange(DifficultyLevel.Easy);
        assertEquals(EASY_HIGH_END_RANGE, actualDifficultyMaxRange);
    }

    @Test
    public void getMaxRange_shouldReturnMediumLevelMaxRange() {
        NumberGuessing numberGuessing = new NumberGuessing();
        int actualDifficultyMaxRange = numberGuessing.getMaxRange(DifficultyLevel.Medium);
        assertEquals(MEDIUM_HIGH_END_RANGE, actualDifficultyMaxRange);
    }

    @Test
    public void getMaxRange_shouldReturnDifficultLevelMaxRange() {
        NumberGuessing numberGuessing = new NumberGuessing();
        int actualDifficultyMaxRange = numberGuessing.getMaxRange(DifficultyLevel.Difficult);
        assertEquals(DIFFICULT_HIGH_END_RANGE, actualDifficultyMaxRange);
    }

    @Test
    public void getMaxRange_shouldReturnRandomNumberForEasyLevel() {
        NumberGuessing numberGuessing = new NumberGuessing();
        int actualRandomNumber = numberGuessing.generateRandomNumber(DifficultyLevel.Easy);
        assertTrue(actualRandomNumber <= EASY_HIGH_END_RANGE);
    }

    @Test
    public void getMaxRange_shouldReturnRandomNumberForMediumLevel() {
        NumberGuessing numberGuessing = new NumberGuessing();
        int actualRandomNumber = numberGuessing.generateRandomNumber(DifficultyLevel.Medium);
        assertTrue(actualRandomNumber <= MEDIUM_HIGH_END_RANGE);
    }

    @Test
    public void getMaxRange_shouldReturnRandomNumberForDifficultLevel() {
        NumberGuessing numberGuessing = new NumberGuessing();
        int actualRandomNumber = numberGuessing.generateRandomNumber(DifficultyLevel.Difficult);
        assertTrue(actualRandomNumber <= DIFFICULT_HIGH_END_RANGE);
    }
}
