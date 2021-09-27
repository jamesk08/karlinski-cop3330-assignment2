/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex31;

import java.text.MessageFormat;

public class App
{
    public static void main( String[] args )
    {
        HeartRateCalculator heartRateCalculator = new HeartRateCalculator();
        int restingPulse = heartRateCalculator.getInput("Please enter your resting pulse: ");
        int age = heartRateCalculator.getInput("Please enter your age: ");
        heartRateCalculator.output(MessageFormat.format("Resting Pulse: {0} \t\tAge: {1}\n", restingPulse, age));
        String message = heartRateCalculator.generateHeartRateTable(restingPulse, age);
        heartRateCalculator.output(message);
    }
}
