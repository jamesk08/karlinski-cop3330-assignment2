/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex24Tests;

import ex24.AnagramChecker;
import org.junit.Test;

import java.text.MessageFormat;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AnagramCheckerTest
{
    AnagramChecker anagramChecker = new AnagramChecker();

    @Test
    public void isAnagram_shouldReturnTrue()
    {
        boolean isAnagram = anagramChecker.isAnagram("tone", "note");
        assertTrue(isAnagram);
    }

    @Test
    public void isAnagram_shouldReturnFalse()
    {
        boolean isAnagram = anagramChecker.isAnagram("zzzz", "yyyy");
        assert(!isAnagram);
    }

    @Test
    public void decideFinalMessageShouldReturnPositiveMessage()
    {
        String fakeFirstInput = "note";
        String fakeSecondInput = "tone";
        String expectedOutput = MessageFormat.format(
            "\"{0}\" and \"{1}\" are anagrams.", fakeFirstInput, fakeSecondInput
        );
        String finalMessage = anagramChecker.decideFinalMessage(fakeFirstInput, fakeSecondInput);

        assertEquals(expectedOutput, finalMessage);
    }
}
