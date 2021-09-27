/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex31;

import java.text.MessageFormat;
import java.util.Scanner;

public class HeartRateCalculator
{
    private static final Scanner scanner = new Scanner(System.in);

    public String generateHeartRateTable(int restingPulse, int age)
    {
        String heartRateTableString = "Intensity\t\t| Rate\n----------------|--------\n";
        int bpm, i;
        for (i = 55; i <= 95; i += 5)
        {
            bpm = calculateBpm(i, age, restingPulse);
            heartRateTableString += MessageFormat.format("{0} %\t\t\t| {1} bpm\n", i, bpm);
        }
        return heartRateTableString;
    }

    public int calculateBpm(int i, double age, double restingPulse)
    {
        return (int) Math.round((((220.0 - age) - restingPulse) * (i / 100.0)) + restingPulse);
    }

    public int getInput(String message)
    {
        int input = 0;
        do
        {
            output(message);
            try
            {
                input = (int) scanner.nextDouble();
                if (input <= 0)
                {
                    System.out.println("Sorry. That is not a valid input.");
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Sorry. That is not a valid input.");
            }
        } while (input <= 0);
        return input;
    }

    public void output(String message)
    {
        System.out.print(message);
    }
}
