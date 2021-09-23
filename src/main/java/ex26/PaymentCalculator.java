/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex26;

import static java.lang.Math.ceil;

public class PaymentCalculator
{
    public int calculateMonthsUntilPaidOff(double balance, double apr, double monthlyPayment)
    {
        double dailyRate = getDailyRate(apr);
        int monthsUntilPaidOff = (int) ceil(
            (-1.0/30.0) * Math.log(1.0 + (balance / monthlyPayment * (1.0 - Math.pow(1.0 + dailyRate, 30.0)))) / Math.log(1.0 + dailyRate)
        );
        return monthsUntilPaidOff;
    }

    private double getDailyRate(double apr)
    {
        return apr/365.0/100.0;
    }
}
