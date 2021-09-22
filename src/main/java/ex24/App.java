/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex24;

import java.text.MessageFormat;
import java.util.Scanner;

public class App
{
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        AnagramChecker anagramChecker = new AnagramChecker();
        String firstInput = getInput("Enter the first string: ");
        String secondInput = getInput("Enter the second string: ");
        boolean isAnagram = anagramChecker.isAnagram(firstInput, secondInput);
        String message = buildMessage(isAnagram, firstInput, secondInput);
        output(message);
    }

    public static String getInput(String message)
    {
        System.out.print(message);
        String inputString = scanner.nextLine();
        if(inputString == null || inputString.isEmpty())
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
        return inputString;
    }

    public static String buildMessage(boolean isAnagram, String firstInput, String secondInput)
    {
        String decisionMessage = isAnagram ? "are anagrams" : "are not anagrams";
        return MessageFormat.format(
            "\"{0}\" and \"{1}\" {2}.", firstInput, secondInput, decisionMessage
        );
    }

    private static void output(String message)
    {
        System.out.print(message);
    }
}
