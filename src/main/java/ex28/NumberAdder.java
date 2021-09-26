/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex28;

import java.util.Scanner;

public class NumberAdder
{
    private int _maximumInputCount;

    static Scanner scanner = new Scanner(System.in);

    public NumberAdder(int maximumInputCount)
    {
        _maximumInputCount = maximumInputCount;
    }

    public int sumNumberInputs(int[] numberInputs)
    {
        int total = 0;
        for (int numberInput : numberInputs)
            total += numberInput;
        return total;
    }

    public int getNumberInputSum()
    {
        int[] numbers = new int[_maximumInputCount];
        for (int i = 0; i < _maximumInputCount; i++)
        {
            numbers[i] = getInput();
        }

        return sumNumberInputs(numbers);
    }

    public static int getInput ()
    {
        output("Enter a number: ");
        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }

    private static void output(String message)
    {
        System.out.print(message);
    }
}
