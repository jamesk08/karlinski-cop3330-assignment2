/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex37;

import java.security.SecureRandom;
import java.util.*;

public class PasswordGenerator
{
    static Scanner scanner = new Scanner(System.in);

    public String generatePassword(int maxLength, int specialCharactersCount, int numberCount)
    {
        validatePasswordRequest(maxLength, specialCharactersCount, numberCount);

        List<Character> alphabetChars = Arrays.asList('a','b','c','d','e','f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'J', 'K', 'L', 'M', 'N', 'P', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');
        List<Character> specialChars = Arrays.asList('^','$','?','!','@','#','%','&','<','>','[',']','{','}','=','-','*','^','~','=');
        List<Character> numberChars = Arrays.asList('0','1','2','3','4','5','6','7','8','9');

        StringBuilder password = new StringBuilder();

        addCharacter(password, specialChars, specialCharactersCount, maxLength);
        addCharacter(password, numberChars, numberCount, maxLength);

        int remainingCharCount = maxLength - specialCharactersCount - numberCount;
        addCharacter(password, alphabetChars, remainingCharCount, maxLength);

        List<String> passwordCharacterList = Arrays.asList(password.toString().split(""));
        Collections.shuffle(passwordCharacterList);
        return String.join("", passwordCharacterList);
    }

    public void addCharacter(StringBuilder password, List<Character> sourceChars, int desiredLength, int maxLength)
    {
        Random random = new SecureRandom();
        for (int i = 0; i < desiredLength; i++)
        {
            if(password.length() == maxLength) break;
            Character randomCharacter = sourceChars.get(random.nextInt(sourceChars.size()));
            password.append(randomCharacter);
        }
    }

    public int GetInput(String message)
    {
        output(message);
        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }

    public void output(String message)
    {
        System.out.print(message);
    }

    private void validatePasswordRequest(int totalLength, int specialCharactersCount, int numberCount)
    {
        if (totalLength < specialCharactersCount + numberCount)
        {
            output("Invalid entry. Total character length must not be less than the total of special character and number counts");
            System.exit(0);
        }
    }
}
