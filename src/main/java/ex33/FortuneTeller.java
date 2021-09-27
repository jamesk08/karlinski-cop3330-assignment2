package ex33;

import java.util.Random;
import java.util.Scanner;

public class FortuneTeller
{
    final static Scanner scanner = new Scanner(System.in);
    final static String[] responses = new String[]{ "Yes", "No", "Maybe", "Ask Again Later" };

    public void PretendLikeAskingQuestion()
    {
        output("What's your question?\n> ");
        scanner.next();
        outputLine("");
    }

    public String getAnswer()
    {
        return responses[generateRandomNumber()];
    }

    public int generateRandomNumber()
    {
        return new Random().nextInt(responses.length);
    }

    public void output(String message)
    {
        System.out.print(message);
    }

    public void outputLine(String message)
    {
        System.out.println(message);
    }
}
