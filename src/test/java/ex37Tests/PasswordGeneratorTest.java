/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex37Tests;

import ex37.PasswordGenerator;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import static org.junit.Assert.assertTrue;

public class PasswordGeneratorTest
{
    List<Character> alphabetChars = Arrays.asList('a','b','c','d','e','f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'J', 'K', 'L', 'M', 'N', 'P', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');
    List<Character> specialChars = Arrays.asList('$','?','!','@','#','%','&','<','>','{','}','=','*','^','~');
    List<Character> numberChars = Arrays.asList('0','1','2','3','4','5','6','7','8','9');

    PasswordGenerator passwordGenerator = new PasswordGenerator();

    @Test
    public void addCharacter_ShouldAddSpecialCharacters()
    {
        StringBuilder stringBuilder = new StringBuilder();
        passwordGenerator.addCharacter(stringBuilder, specialChars, 3, 3);
        String actual = stringBuilder.toString();
        boolean containsSpecialCharacters = Pattern.compile("^[$?!@#%&<>{}=*^~]{3}$").matcher(actual).find();
        assertTrue(containsSpecialCharacters);
    }

    @Test
    public void addCharacter_ShouldAddNumberCharacters()
    {
        StringBuilder stringBuilder = new StringBuilder();
        passwordGenerator.addCharacter(stringBuilder, numberChars, 3, 3);
        String actual = stringBuilder.toString();
        boolean containsEnoughNumberCharacters = Pattern.compile("^[0-9]{3}$").matcher(actual).find();
        assertTrue(containsEnoughNumberCharacters);
    }

    @Test
    public void addCharacter_ShouldAddAlphabetCharacters()
    {
        StringBuilder stringBuilder = new StringBuilder();
        passwordGenerator.addCharacter(stringBuilder, alphabetChars, 3, 3);
        String actual = stringBuilder.toString();
        boolean containsEnoughAlphabetCharacters = Pattern.compile("^[a-zA-Z]{3}$").matcher(actual).find();
        assertTrue(containsEnoughAlphabetCharacters);
    }
}
