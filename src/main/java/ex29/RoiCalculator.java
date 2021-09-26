/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex29;

import java.util.Scanner;

public class RoiCalculator
{
    private static Scanner scanner = new Scanner(System.in);

    public int getNumberOfYearsToDouble(int returnRate)
    {
        return 72 / returnRate;
    }

    public void output(String message)
    {
        System.out.print(message);
    }

    public int getInput()
    {
        int input = 0;
        do
        {
            output("What is the rate of return? ");
            try {
                input = (int) scanner.nextDouble();
                scanner.nextLine();
                if (input <= 0)
                {
                    output("Sorry. That's not a valid input.\n");
                }
            }
            catch(Exception e)
            {
                output("Sorry. That's not a valid input.\n");
                scanner.nextLine();
            }
        } while (input <= 0);

        return input;
    }
}
