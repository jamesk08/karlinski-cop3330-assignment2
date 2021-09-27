/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex37;

import java.text.MessageFormat;

public class App
{
    public static void main( String[] args )
    {
        PasswordGenerator passwordGenerator = new PasswordGenerator();

        int totalLength = passwordGenerator.GetInput("What's the minimum length? ");
        int specialCharacters = passwordGenerator.GetInput("How many special characters? ");
        int numberCount = passwordGenerator.GetInput("How many numbers? ");

        String password = passwordGenerator.generatePassword(totalLength, specialCharacters, numberCount);
        String message = MessageFormat.format("Your password is {0}", password);
        passwordGenerator.output(message);
    }
}
