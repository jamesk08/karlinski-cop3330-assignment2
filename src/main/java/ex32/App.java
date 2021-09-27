/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex32;

public class App
{
    public static void main(String... args)
    {
        NumberGuessing numberGuessing = new NumberGuessing();
        numberGuessing.output("Let's play Guess the Number!\n");
        numberGuessing.play();
    }
}
