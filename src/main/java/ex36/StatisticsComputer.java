/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex36;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class StatisticsComputer
{
    static Scanner scanner = new Scanner(System.in);
    public ArrayList<Double> usersNumbers = new ArrayList<>();

    public String displayEnteredNumbers()
    {
        String numbersDisplayText = "Numbers: ";
        for (int i = 0; i < usersNumbers.size(); i++)
        {
            double number = usersNumbers.get(i);
            numbersDisplayText += (int) number;

            // if not last item add comma else a new line character
            boolean isLastItem = (i != usersNumbers.size() - 1);
            numbersDisplayText += isLastItem ? ", " : "\n";
        }
        return numbersDisplayText;
    }

    public double calculateStandardDeviation()
    {
        double total = 0.0;
        double currentValue = 0.0;
        int numberCount = usersNumbers.size();
        for (double num : usersNumbers)
        {
            total += num;
        }

        double mean = total/numberCount;
        for (double num : usersNumbers)
        {
            currentValue += Math.pow(num - mean, 2);
        }

        return Math.sqrt(currentValue / numberCount);
    }

    public double calculateAverage()
    {
        return usersNumbers.stream().mapToDouble(d -> d).average().orElse(0.0);
    }

    public double findMinimum()
    {
        return usersNumbers.stream().mapToDouble(d -> d).min().orElse(0.0);
    }

    public double findMaximum()
    {
        return usersNumbers.stream().mapToDouble(d -> d).max().orElse(0.0);
    }

    public void setAllUserInputs()
    {
        String userTextInput;
        boolean keepGoing = true;
        do {
            output("Enter a number: ");
            userTextInput = scanner.nextLine();
            try
            {
                double numberInput = Double.parseDouble(userTextInput);
                if(numberInput > 0)
                {
                    usersNumbers.add(numberInput);
                }
                else
                {
                    output("Input must be greater than 0.");
                }
            }
            catch (NumberFormatException e)
            {
                if(userTextInput.equalsIgnoreCase("done"))
                {
                    if (usersNumbers.size() == 0)
                    {
                        output("No numbers were entered. Application will now exit. Bye.");
                        System.exit(0);
                    }

                    keepGoing = false;
                }
                else
                {
                    output("Invalid input. Only a number or the word \"done\" are valid entries.");
                }
            }
        } while(keepGoing);
    }

    public void displayResults(double average, double minimum, double maximum, double standardDeviation)
    {
        output(MessageFormat.format("The average is {0}\n", new DecimalFormat("#0.0").format(average)));
        output(MessageFormat.format("The minimum is {0}\n", minimum));
        output(MessageFormat.format("The maximum is {0}\n", maximum));
        output(MessageFormat.format("The standard deviation is {0}\n", new DecimalFormat("#0.00").format(standardDeviation)));
    }

    public void output(String message)
    {
        System.out.print(message);
    }
}
