/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex28;

import java.text.MessageFormat;

public class App
{
    final static int MAX_INPUT_COUNT = 5;

    public static void main( String[] args )
    {
        NumberAdder numberAdder = new NumberAdder(MAX_INPUT_COUNT);
        int total = numberAdder.getNumberInputSum();
        System.out.println(MessageFormat.format("The total is {0}.", total));
    }
}
