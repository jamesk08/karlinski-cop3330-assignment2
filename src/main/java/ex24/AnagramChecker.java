package ex24;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker
{
    private static Scanner scanner = new Scanner(System.in);

    public boolean isAnagram(String firstWord, String secondWord)
    {
        if(firstWord.length() != secondWord.length())
            return false;

        char[] lettersOfFirstWord = firstWord.toCharArray();
        Arrays.sort(lettersOfFirstWord);

        char[] lettersOfSecondWord = secondWord.toCharArray();
        Arrays.sort(lettersOfSecondWord);

        return Arrays.equals(lettersOfFirstWord,lettersOfSecondWord);
    }

    public String getInput(String message)
    {
        System.out.print(message);
        String inputString = scanner.nextLine();
        if(inputString == null || inputString.isEmpty())
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
        return inputString;
    }

    public String decideFinalMessage(String firstInput, String secondInput)
    {
        String decisionMessage = isAnagram(firstInput, secondInput)
            ? "are anagrams"
            : "are not anagrams";

        return MessageFormat.format(
            "\"{0}\" and \"{1}\" {2}.", firstInput, secondInput, decisionMessage
        );
    }
}
