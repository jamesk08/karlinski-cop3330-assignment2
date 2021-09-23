/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex26Tests;

import ex26.PaymentCalculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PaymentCalculatorTests
{
    PaymentCalculator paymentCalculator = new PaymentCalculator();

    @Test
    public void calculateMonthsToPayoff_shouldReturnsExpected()
    {
        final double balance = 5000;
        final double aprInput = 12;
        final double monthlyPayment = 100;
        final int expectedMonthsUntilPaidOff = 70;
        int monthsUntilPaidOffResult = paymentCalculator.calculateMonthsUntilPaidOff(balance, aprInput, monthlyPayment);
        assertEquals(expectedMonthsUntilPaidOff, monthsUntilPaidOffResult);
    }
}
