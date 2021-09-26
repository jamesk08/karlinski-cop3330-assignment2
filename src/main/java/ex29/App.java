/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex29;

import java.text.MessageFormat;

public class App
{
    public static void main( String[] args )
    {
        RoiCalculator roiCalculator = new RoiCalculator();
        int returnRate = roiCalculator.getInput();
        int yearsToDouble = roiCalculator.getNumberOfYearsToDouble(returnRate);
        String message = MessageFormat.format("It will take {0} years to double your initial investment.", yearsToDouble);
        roiCalculator.output(message);
    }
}
