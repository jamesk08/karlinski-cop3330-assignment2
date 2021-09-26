/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex30;

import java.text.MessageFormat;

public class MultiplicationTableBuilder
{
    static final int MAX_LIMIT = 12;

    public String buildMultiplicationTable()
    {
        String multiplicationTable = "";
        for (int i = 1; i <= MAX_LIMIT; i++)
        {
            for (int j = 1; j <= 12; j++)
            {
                int currentResult = i * j;
                multiplicationTable += MessageFormat.format("{0}\t", currentResult);
            }
            multiplicationTable += "\n";
        }
        return multiplicationTable;
    }
}
