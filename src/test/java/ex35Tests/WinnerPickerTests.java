/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex35Tests;

import ex35.WinnerPicker;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class WinnerPickerTests
{
    @Test
    public void getWinner_shouldReturnExpectedWinner()
    {
        ArrayList<String> contestants = new ArrayList<>();
        contestants.add("Bob Dob");
        contestants.add("Dom Gom");
        contestants.add("Tom Mom");
        contestants.add("Ken Zen");

        WinnerPicker winnerPicker = new WinnerPicker();
        winnerPicker.contestants = contestants;

        String winner = winnerPicker.getWinner();
        assertTrue(contestants.contains(winner));
    }
}

