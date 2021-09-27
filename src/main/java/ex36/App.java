/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex36;

public class App
{
    public static void main( String[] args )
    {
        StatisticsComputer statisticsComputer = new StatisticsComputer();

        statisticsComputer.setAllUserInputs();
        String enteredNumbersMessage = statisticsComputer.displayEnteredNumbers();
        statisticsComputer.output(enteredNumbersMessage);

        double average = statisticsComputer.calculateAverage();
        double minimum = statisticsComputer.findMinimum();
        double maximum = statisticsComputer.findMaximum();
        double standardDeviation = statisticsComputer.calculateStandardDeviation();

        statisticsComputer.displayResults(average, minimum, maximum, standardDeviation);
    }
}
