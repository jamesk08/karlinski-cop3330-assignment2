/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex27;

import java.text.MessageFormat;
import java.util.regex.Pattern;

public class InputValidator
{
    public String validateInput(String firstName, String lastName, String zipCode, String employeeId)
    {
        String validationMessage = "";
        validationMessage += validateNameFields(firstName, NameInputType.Firstname);
        validationMessage += validateNameFields(lastName, NameInputType.Lastname);
        validationMessage += validateEmployeeId(employeeId);
        validationMessage += validateZipCode(zipCode);
        validationMessage += validationMessage.length() == 0 ? "There are no errors." : "";
        return validationMessage;
    }

    public String validateNameFields(String nameInput, NameInputType inputType)
    {
        String validationMessage = "";
        String inputName = inputType == NameInputType.Firstname ? "first" : "last";
        boolean isPresent = nameInput != null && !nameInput.isEmpty();
        if(!isPresent)
            validationMessage = MessageFormat.format("The {0} name must be filled in.\n", inputName);

        boolean satisfiesMinLength = nameInput != null && nameInput.length() >= 2;
        if (!satisfiesMinLength)
            validationMessage += MessageFormat.format("The {0} name must be at least 2 characters long.\n", inputName);

        return validationMessage;
    }

    private String validateEmployeeId(String input)
    {
        String validationMessage = "";
        Pattern pattern = Pattern.compile("^[a-zA-Z]{2}+-[0-9]{4}+$");
        boolean invalidEmployeeId = !pattern.matcher(input).find();
        if (invalidEmployeeId)
            validationMessage += "The employee ID must be in the format of AA-1234.\n";

        return validationMessage;
    }

    private String validateZipCode(String input)
    {
        String validationMessage = "";
        Pattern zipcodePattern = Pattern.compile("^[0-9]{5}+$");
        boolean invalidZipCode = input == null || !zipcodePattern.matcher(input).find();
        if (invalidZipCode)
            validationMessage = "The zipcode must be a 5 digit number.";

        return validationMessage;
    }
}
