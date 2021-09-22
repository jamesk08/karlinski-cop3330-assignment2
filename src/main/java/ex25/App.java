/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex25;

import java.util.Scanner;

public class App
{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        String password = GetPasswordInput();
        PasswordValidator passwordValidator = new PasswordValidator();
        StrengthLevel passwordStrength = passwordValidator.getPasswordStrengthLevel(password);
        String message = passwordValidator.getOutputMessage(password, passwordStrength);
        output(message);
    }

    private static String GetPasswordInput()
    {
        System.out.print("Password: ");
        String password = scanner.nextLine();
        if(password == null || password.isEmpty())
        {
            System.out.println("Invalid input was received.");
            System.exit(0);
        }
        return password;
    }

    private static void output(String message)
    {
        System.out.println(message);
    }
}
