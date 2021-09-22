   
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex25;

import java.text.MessageFormat;
import java.util.regex.Pattern;

public class PasswordValidator
{
    private static final int MIN_REQUIRED_PASSWORD_LENGTH = 8;

    public StrengthLevel getPasswordStrengthLevel(String password)
    {
        StrengthLevel strengthLevel;

        boolean containsLetter = containsLetter(password);
        boolean containsNumber = containsNumber(password);
        boolean containsSpecialCharacter = containsSpecialCharacter(password);
        boolean meetsMinLengthRule = password.length() >= MIN_REQUIRED_PASSWORD_LENGTH;

        if (containsLetter && containsNumber && containsSpecialCharacter && meetsMinLengthRule)
        {
            strengthLevel = StrengthLevel.VeryStrong;
        }
        else if (containsNumber && containsLetter && meetsMinLengthRule)
        {
            strengthLevel = StrengthLevel.Strong;
        }
        else if (containsLetter && !meetsMinLengthRule)
        {
            strengthLevel = StrengthLevel.Weak;
        }
        else
        {
            strengthLevel = StrengthLevel.VeryWeak;
        }

        return strengthLevel;
    }

    public boolean containsNumber(String password)
    {
        Pattern numberPattern = Pattern.compile(".[0-9]");
        return numberPattern.matcher(password).find();
    }

    public boolean containsLetter(String password)
    {
        Pattern regexPattern = Pattern.compile(".[a-z]", Pattern.CASE_INSENSITIVE);
        return regexPattern.matcher(password).find();
    }

    public boolean containsSpecialCharacter(String password)
    {
        Pattern specialCharacterPattern = Pattern.compile(".[^a-z0-9]", Pattern.CASE_INSENSITIVE);
        return specialCharacterPattern.matcher(password).find();
    }

    public String getOutputMessage(String password, StrengthLevel passwordStrength)
    {
        String passwordStrengthText;
        switch (passwordStrength)
        {
            case VeryStrong:
                passwordStrengthText = "very strong";
                break;
            case Strong:
                passwordStrengthText = "strong";
                break;
            case Weak:
                passwordStrengthText = "weak";
                break;
            case VeryWeak:
                passwordStrengthText = "very weak";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + passwordStrength);
        }

        return MessageFormat.format("The password \"{0}\" is a {1} password.", password, passwordStrengthText);
    }
}
