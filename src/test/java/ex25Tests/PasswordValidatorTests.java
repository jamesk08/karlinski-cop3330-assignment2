/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex25Tests;

import ex25.PasswordValidator;
import ex25.StrengthLevel;
import org.junit.Test;

import java.text.MessageFormat;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PasswordValidatorTests
{
    public static final String FAKE_PASSWORD = "doesntMatterWhatThePasswordIsWeJustWannaTestTheMessage";

    PasswordValidator passwordValidator = new PasswordValidator();

    @Test
    public void getPasswordStrengthLevel_ReturnsVeryStrongStrengthLevel()
    {
        StrengthLevel expectedStrengthLevel = StrengthLevel.VeryStrong;
        StrengthLevel strengthLevelResult = passwordValidator.getPasswordStrengthLevel("!@#123Ag");
        assertEquals(expectedStrengthLevel, strengthLevelResult);
    }

    @Test
    public void getPasswordStrengthLevel_ReturnsStrongStrengthLevel()
    {
        StrengthLevel expectedStrengthLevel = StrengthLevel.Strong;
        StrengthLevel strengthLevelResult = passwordValidator.getPasswordStrengthLevel("Abc135yZ");
        assertEquals(expectedStrengthLevel, strengthLevelResult);
    }

    @Test
    public void getPasswordStrengthLevel_ReturnsWeakStrengthLevel()
    {
        StrengthLevel expectedStrengthLevel = StrengthLevel.Weak;
        StrengthLevel strengthLevelResult = passwordValidator.getPasswordStrengthLevel("yyyZZZ");
        assertEquals(expectedStrengthLevel, strengthLevelResult);
    }

    @Test
    public void getPasswordStrengthLevel_ReturnsVeryWeakStrengthLevel()
    {
        StrengthLevel expectedStrengthLevel = StrengthLevel.VeryWeak;
        StrengthLevel strengthLevelResult = passwordValidator.getPasswordStrengthLevel("123456");
        assertEquals(expectedStrengthLevel, strengthLevelResult);
    }

    @Test
    public void containsLetter_ShouldReturnTrue()
    {
        boolean containsLetter = passwordValidator.containsLetter("!@#123A");
        assertTrue(containsLetter);
    }

    @Test
    public void containsLetter_ShouldReturnFalse()
    {
        boolean doesNotContainLetter = !passwordValidator.containsLetter("65465_!#4");
        assertTrue(doesNotContainLetter);
    }

    @Test
    public void containsNumber_ShouldReturnTrue()
    {
        boolean containsNumber = passwordValidator.containsNumber("ABcd7!#.");
        assertTrue(containsNumber);
    }

    @Test
    public void containsNumber_ShouldReturnFalse()
    {
        boolean doesNotContainNumber = !passwordValidator.containsNumber("Z{ - - }Z");
        assertTrue(doesNotContainNumber);
    }

    @Test
    public void containsSpecialCharacter_ShouldReturnTrue()
    {
        boolean containsNumber = passwordValidator.containsSpecialCharacter("ABcd1!");
        assertTrue(containsNumber);
    }

    @Test
    public void containsSpecialCharacter_ShouldReturnFalse()
    {
        boolean doesNotContainSpecialCharacter = !passwordValidator.containsSpecialCharacter("321ABA");
        assertTrue(doesNotContainSpecialCharacter);
    }

    @Test
    public void getOutputMessage_ShouldReturnVeryStrongPasswordMessage()
    {
        String expectedMessage = MessageFormat.format("The password \"{0}\" is a very strong password.", FAKE_PASSWORD);
        String resultMessage = passwordValidator.getOutputMessage(FAKE_PASSWORD, StrengthLevel.VeryStrong);
        assertEquals(expectedMessage, resultMessage);
    }

    @Test
    public void getOutputMessage_ShouldReturnStrongPasswordMessage()
    {
        String expectedMessage = MessageFormat.format("The password \"{0}\" is a strong password.", FAKE_PASSWORD);
        String resultMessage = passwordValidator.getOutputMessage(FAKE_PASSWORD, StrengthLevel.Strong);
        assertEquals(expectedMessage, resultMessage);
    }

    @Test
    public void getOutputMessage_ShouldReturnWeakPasswordMessage()
    {
        String expectedMessage = MessageFormat.format("The password \"{0}\" is a weak password.", FAKE_PASSWORD);
        String resultMessage = passwordValidator.getOutputMessage(FAKE_PASSWORD, StrengthLevel.Weak);
        assertEquals(expectedMessage, resultMessage);
    }

    @Test
    public void getOutputMessage_ShouldReturnVeryWeakPasswordMessage()
    {
        String expectedMessage = MessageFormat.format("The password \"{0}\" is a very weak password.", FAKE_PASSWORD);
        String resultMessage = passwordValidator.getOutputMessage(FAKE_PASSWORD, StrengthLevel.VeryWeak);
        assertEquals(expectedMessage, resultMessage);
    }
}
