/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex27Tests;

import ex27.InputValidator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest 
{
    @Test
    public void validateInput_shouldHaveNoErrors()
    {
        final String firstName = "Bo";
        final String lastName = "Mo";
        final String zipCode = "36541";
        final String employeeId = "TK-4321";
        final String expected = "There are no errors.";

        InputValidator inputValidator = new InputValidator();
        String actual = inputValidator.validateInput(firstName, lastName, zipCode, employeeId);
        assertEquals(expected, actual);
    }

    @Test
    public void validateInput_shouldHaveErrors()
    {
        final String firstName = "A";
        final String zipCode = "ABCDE";
        final String employeeId = "A12-1234";
        final String expected =
            "The first name must be at least 2 characters long.\n" +
            "The last name must be filled in.\n" +
            "The last name must be at least 2 characters long.\n" +
            "The employee ID must be in the format of AA-1234.\n" +
            "The zipcode must be a 5 digit number.";

        InputValidator inputValidator = new InputValidator();
        String actual = inputValidator.validateInput(firstName, null, zipCode, employeeId);
        assertEquals(expected, actual);
    }
}
