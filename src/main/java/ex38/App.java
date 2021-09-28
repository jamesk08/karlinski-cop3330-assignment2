/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex38;

public class App
{
    public static void main( String[] args )
    {
        ValueFilterer valueFilterer = new ValueFilterer();
        String numberString = valueFilterer.getInput("Enter a list of numbers, separated by spaces: ");
        int[] numbers = valueFilterer.convertNumberStringToArray(numberString);
        int[] evenNumbers = valueFilterer.filterEvenNumbers(numbers);
        valueFilterer.displayNumbers(evenNumbers);
    }
}
