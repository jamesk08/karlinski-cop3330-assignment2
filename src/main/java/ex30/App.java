/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex30;

public class App
{
    public static void main(String[] args)
    {
        MultiplicationTableBuilder multiplicationTableBuilder = new MultiplicationTableBuilder();
        String multiplicationTable = multiplicationTableBuilder.buildMultiplicationTable();
        output(multiplicationTable);
    }

    private static void output(String message)
    {
        System.out.print(message);
    }
}
