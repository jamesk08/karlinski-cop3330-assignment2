/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex35;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WinnerPicker
{
    static final Scanner scanner = new Scanner(System.in);

    public ArrayList<String> contestants;

    public WinnerPicker()
    {
        contestants = new ArrayList<>();
    }

    public void getContestantNameInputs()
    {
        String name;
        do {
            System.out.print("Enter a name: ");
            name = scanner.nextLine();
            if(name != null && !name.equals(""))
            {
                contestants.add(name);
            }
        } while(name != null && !name.equals(""));
    }

    public String getWinner()
    {
        int winnerIndex = new Random().nextInt(contestants.size());
        return contestants.get(winnerIndex);
    }

    public void outputWinner()
    {
        String output = String.format("The winner is... %s.", getWinner());
        System.out.println(output);
    }
}
