/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex34;

public class App
{
    public static void main( String[] args )
    {
        EmployeeHandler employeeHandler = new EmployeeHandler();
        employeeHandler.displayEmployees(employeeHandler.employees);
        String employeeToRemove = employeeHandler.getEmployeeNameToRemove();
        employeeHandler.removeEmployee(employeeToRemove);
        employeeHandler.displayEmployees(employeeHandler.employees);
    }
}
