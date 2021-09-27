/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex32;

import java.text.MessageFormat;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessing
{
    final static Scanner scanner = new Scanner(System.in);
    final int EASY_HIGH_END_RANGE = 10;
    final int MEDIUM_HIGH_END_RANGE = 100;
    final int DIFFICULT_HIGH_END_RANGE = 1000;

    public void play()
    {
        char keepGoing;
        do
        {
            DifficultyLevel difficultyLevel;
            int guessCount = 0;
            difficultyLevel = getDifficultyInput("Enter the difficulty level (1, 2, or 3): ");
            int randomNum = generateRandomNumber(difficultyLevel);
            int usersGuess = getUserGuessInput("I have my number. What's your guess? ", difficultyLevel);
            guessCount++;
            while (usersGuess != randomNum)
            {
                if(usersGuess > randomNum)
                {
                    usersGuess = getUserGuessInput("Too high. Guess again: ", difficultyLevel);
                    guessCount++;
                }
                if(usersGuess < randomNum)
                {
                    usersGuess = getUserGuessInput("Too low. Guess again: ", difficultyLevel);
                    guessCount++;
                }
            }
            output(MessageFormat.format("You got it in {0} guesses!\n", guessCount));
            keepGoing = getCharInput("Do you wish to play again (Y/N)? ");
        } while (keepGoing == 'y');
    }

    public int generateRandomNumber(DifficultyLevel difficultyLevel)
    {
        int difficultyMaxRange = getMaxRange(difficultyLevel);
        return new Random().nextInt(difficultyMaxRange + 1);
    }

    public int getMaxRange(DifficultyLevel difficultyLevel)
    {
        switch (difficultyLevel)
        {
            case Easy: return EASY_HIGH_END_RANGE;
            case Medium: return MEDIUM_HIGH_END_RANGE;
            case Difficult: return DIFFICULT_HIGH_END_RANGE;
        }
        return 0;
    }

    public DifficultyLevel getDifficultyInput(String message)
    {
        int input = 0;
        do
        {
            output(message);
            try
            {
                input = (int) scanner.nextDouble();
                if (input <= 0 || input > 3)
                {
                    output("Sorry. That is not a valid input.\n");
                }
            }
            catch (NumberFormatException e)
            {
                output("Sorry. That is not a valid input.\n");
            }
        } while (input <= 0 || input > 3);

        DifficultyLevel difficultyLevel = DifficultyLevel.NotSet;
        switch (input)
        {
            case 1:
                difficultyLevel = DifficultyLevel.Easy;
                break;
            case 2: difficultyLevel =
                DifficultyLevel.Medium;
                break;
            case 3: difficultyLevel =
                DifficultyLevel.Difficult;
                break;
        }
        return difficultyLevel;
    }

    public int getUserGuessInput(String message, DifficultyLevel difficultyLevel)
    {
        int input = 0;
        do
        {
            output(message);
            try
            {
                input = (int) scanner.nextDouble();
                if (input <= 0 || input > getMaxRange(difficultyLevel))
                {
                    output("Sorry. That is not a valid input.\n");
                }
            }
            catch (NumberFormatException e)
            {
                output("Sorry. That is not a valid input.\n");
            }
        } while (input <= 0 || input > getMaxRange(difficultyLevel));
        return input;
    }

    public char getCharInput(String message)
    {
        output(message);
        char charInput = scanner.next().charAt(0);
        return Character.toLowerCase(charInput);
    }

    public void output(String message)
    {
        System.out.print(message);
    }
}
