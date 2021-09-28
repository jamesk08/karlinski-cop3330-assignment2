/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex38;

import java.util.Scanner;

public class ValueFilterer
{
    static final Scanner scanner = new Scanner(System.in);

    public int[] filterEvenNumbers(int[] numbers)
    {
        if (numbers.length == 0)
        {
            output("Error: The source number list is empty.");
            System.exit(0);
        }

        int evenNumbersLength = getEvenNumberArrayLength(numbers);

        int[] evenNumbers = new int[evenNumbersLength];
        if (evenNumbersLength > 0)
        {
            int counter = 0;
            for (int number : numbers) {
                if (number % 2 == 0) {
                    evenNumbers[counter] = number;
                    counter++;
                }
            }
        }
        return evenNumbers;
    }

    public int getEvenNumberArrayLength(int[] numbers)
    {
        int counter = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public int[] convertNumberStringToArray(String numberString)
    {
        String[] numberStrings = numberString.split(" ");
        int[] numbers = new int[numberStrings.length];
        for (int i = 0; i < numberStrings.length; i++)
        {
            try
            {
                numbers[i] = Integer.parseInt(numberStrings[i]);
            }
            catch(Exception e)
            {
                output("Invalid entry. Failed to parse array item.");
                System.exit(0);
            }
        }
        return numbers;
    }

    public void displayNumbers(int[] evenNumbers)
    {
        if (evenNumbers.length == 0)
        {
            output("There were no even numbers.");
        }
        else
        {
            StringBuilder evenNumberMessage = new StringBuilder("The even numbers are");
            for (Integer integer : evenNumbers) {
                evenNumberMessage.append(" ").append(integer);
            }
            output(evenNumberMessage.append(".").toString());
        }
    }

    public String getInput(String message)
    {
        output(message);
        String response = scanner.nextLine();
        if (response == null || response.isEmpty())
        {
            output("Invalid input.");
            System.exit(0);
        }
        return response;
    }

    public void output(String message)
    {
        System.out.print(message);
    }
}
