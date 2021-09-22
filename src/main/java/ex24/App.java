/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex24;

public class App
{
    public static void main(String[] args)
    {
        AnagramChecker anagramChecker = new AnagramChecker();
        String firstInput = anagramChecker.getInput("Enter the first string: ");
        String secondInput = anagramChecker.getInput("Enter the second string: ");
        String finalMessage = anagramChecker.decideFinalMessage(firstInput, secondInput);
        out(finalMessage);
    }

    private static void out(String message)
    {
        System.out.print(message);
    }
}
