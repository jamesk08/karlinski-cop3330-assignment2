/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex24Tests;

import ex24.AnagramChecker;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AnagramCheckerTests
{
    AnagramChecker anagramChecker = new AnagramChecker();

    @Test
    public void isAnagram_shouldReturnTrue()
    {
        boolean isAnagram = anagramChecker.isAnagram("tone", "note");
        assertTrue(isAnagram);
    }

    @Test
    public void isAnagram_shouldReturnFalseWhenNotAnagrams()
    {
        boolean isAnagram = anagramChecker.isAnagram("abcde", "xoxox");
        assert(!isAnagram);
    }

    @Test
    public void isAnagram_shouldReturnFalseWhenLenghtsDontMatch()
    {
        boolean isAnagram = anagramChecker.isAnagram("abcdef", "y");
        assert(!isAnagram);
    }
}
