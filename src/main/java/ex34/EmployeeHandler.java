/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex34;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeHandler
{
    public ArrayList<String> employees = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public EmployeeHandler()
    {
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");
    }

    public void displayEmployees(ArrayList<String> employeeList)
    {
        int employeeCount = employeeList.size();
        String employeeListText = MessageFormat.format("There are {0} employees:\n", employeeCount);
        for (String name : employeeList) {
            employeeListText += (name + "\n");
        }
        output(employeeListText);
    }

    public void removeEmployee(String employeeNameToRemove)
    {
        employees.remove(employeeNameToRemove);
    }

    public String getEmployeeNameToRemove()
    {
        output("Enter an employee name to remove: ");
        return scanner.nextLine();
    }

    public void output(String message)
    {
        System.out.print(message);
    }
}
