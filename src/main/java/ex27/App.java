/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex27;

import java.util.Scanner;

public class App
{
    private static Scanner scanner = new Scanner(System.in);

    public static void main( String[] args )
    {
        String firstName = getInput("Enter the first name: ");
        String lastName = getInput("Enter the last name: ");
        String zipCode = getInput("Enter the ZIP code: ");
        String employeeId = getInput("Enter the employee ID: ");

        InputValidator inputValidator = new InputValidator();
        String validationMessage = inputValidator.validateInput(firstName, lastName, zipCode, employeeId);
        output(validationMessage);
    }

    private static String getInput(String inputRequestMessage)
    {
        System.out.print(inputRequestMessage);
        return scanner.nextLine();
    }

    private static void output(String message)
    {
        System.out.println(message);
    }
}
