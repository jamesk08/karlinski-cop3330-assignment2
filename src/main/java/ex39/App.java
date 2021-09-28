/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex39;

public class App
{
    public static void main(String[] args)
    {
        EmployeeRecordsManager employeeRecordsManager = new EmployeeRecordsManager();

        employeeRecordsManager.output("\nBefore sorting: ");
        employeeRecordsManager.displayEmployees();

        employeeRecordsManager.sortEmployeeRecords();

        employeeRecordsManager.output("\nAfter sorting: ");
        employeeRecordsManager.displayEmployees();
    }
}
