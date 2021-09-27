/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex34Tests;

import ex34.EmployeeHandler;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EmployeeHandlerTests
{
    @Test
    public void shouldAnswerWithTrue()
    {
        EmployeeHandler employeeHandler = new EmployeeHandler();
        final String EMPLOYEE_TO_REMOVE = "Jeremy Goodwin";
        assertTrue(employeeHandler.employees.contains(EMPLOYEE_TO_REMOVE));

        employeeHandler.removeEmployee(EMPLOYEE_TO_REMOVE);
        assertFalse(employeeHandler.employees.contains(EMPLOYEE_TO_REMOVE));
    }
}
