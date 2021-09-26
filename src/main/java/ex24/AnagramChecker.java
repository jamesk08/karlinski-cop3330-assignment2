/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex24;

import java.util.Arrays;

public class AnagramChecker
{
    public boolean isAnagram(String firstWord, String secondWord)
    {
        if(firstWord.length() != secondWord.length())
            return false;

        char[] lettersOfFirstWord = firstWord.toCharArray();
        Arrays.sort(lettersOfFirstWord);

        char[] lettersOfSecondWord = secondWord.toCharArray();
        Arrays.sort(lettersOfSecondWord);

        return Arrays.equals(lettersOfFirstWord,lettersOfSecondWord);
    }
}
