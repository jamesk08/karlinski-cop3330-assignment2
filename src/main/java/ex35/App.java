/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex35;

public class App
{
    public static void main(String[] args)
    {
        WinnerPicker winnerPicker = new WinnerPicker();
        winnerPicker.getContestantNameInputs();
        winnerPicker.getWinner();
        winnerPicker.outputWinner();
    }
}
