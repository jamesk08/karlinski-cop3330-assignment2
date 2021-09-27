/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex33Tests;

import ex33.FortuneTeller;
import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

import static org.junit.Assert.assertTrue;

public class FortuneTellingTests
{
    final static String[] responses = new String[]{ "Yes", "No", "Maybe", "Ask Again Later" };

    @Test
    public void getAnswer_shouldReturnAnArrayItem()
    {
        FortuneTeller fortuneTeller = new FortuneTeller();
        String answer = fortuneTeller.getAnswer();
        assertTrue(Arrays.asList(responses).contains(answer));
    }

    @Test
    public void generateRandomNumber_shouldGenerateNumberWithingExpectedRange()
    {
        FortuneTeller fortuneTeller = new FortuneTeller();
        int randomNumber = fortuneTeller.generateRandomNumber();
        assertTrue(randomNumber > 0 && randomNumber <= responses.length);
    }
}
