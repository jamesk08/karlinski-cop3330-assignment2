/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex26;

import java.text.MessageFormat;
import java.util.Scanner;

public class App
{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        PaymentCalculator paymentCalculator = new PaymentCalculator();
        double balance = getInput("What is your balance? ");
        double apr = getInput("What is the APR on the card (as a percent)? ");
        double monthlyPayment = getInput("What is the monthly payment you can make? ");
        int monthsToPayoff = paymentCalculator.calculateMonthsUntilPaidOff(balance, apr, monthlyPayment);
        output(MessageFormat.format("It will take you {0} months to pay off this card.", monthsToPayoff));
    }

    public static double getInput(String message)
    {
        System.out.print(message);
        double input = scanner.nextDouble();
        scanner.nextLine();
        return input;
    }

    public static void output(String message)
    {
        System.out.println(message);
    }
}
