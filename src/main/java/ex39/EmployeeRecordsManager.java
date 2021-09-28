/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 James Karlinski
 */

package ex39;

import java.text.MessageFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmployeeRecordsManager
{
    List<Map<String, String>> employeeRecords = new ArrayList<>();
    static final String FIRST_NAME = "Firstname";
    static final String LAST_NAME = "Lastname";
    static final String POSITION = "Position";
    static final String SEPARATION_DATE = "SeparationDate";
    static final String SPACING1 = "Spacing1";
    static final String SPACING2 = "Spacing2";

    public EmployeeRecordsManager()
    {
        Map<String, String> employee1 = new HashMap<>();
        employee1.put(FIRST_NAME, "John");
        employee1.put(LAST_NAME,"Johnson");
        employee1.put(SPACING1, "\t\t");
        employee1.put(POSITION, "Manager");
        employee1.put(SPACING2, "\t\t\t");
        employee1.put(SEPARATION_DATE, "2016-12-31");
        employeeRecords.add(employee1);

        Map<String, String> employee2 = new HashMap<>();
        employee2.put(FIRST_NAME, "Tou");
        employee2.put(LAST_NAME, "Xiong");
        employee2.put(SPACING1, "\t\t\t");
        employee2.put(POSITION, "Software Engineer");
        employee2.put(SPACING2, "\t");
        employee2.put(SEPARATION_DATE, "2016-10-05");
        employeeRecords.add(employee2);

        Map<String, String> employee3 = new HashMap<>();
        employee3.put(FIRST_NAME, "Michaela");
        employee3.put(LAST_NAME, "Michaelson");
        employee3.put(SPACING1, " ");
        employee3.put(POSITION, "District Manager");
        employee3.put(SPACING2, "\t");
        employee3.put(SEPARATION_DATE, "2015-12-19");
        employeeRecords.add(employee3);

        Map<String, String> employee4 = new HashMap<>();
        employee4.put(FIRST_NAME, "Jake");
        employee4.put(LAST_NAME, "Jacobson");
        employee4.put(SPACING1, "\t\t");
        employee4.put(POSITION, "Programmer");
        employee4.put(SPACING2, "\t\t");
        employee4.put(SEPARATION_DATE, "");
        employeeRecords.add(employee4);

        Map<String, String> employee5 = new HashMap<>();
        employee5.put(FIRST_NAME, "Jacquelyn");
        employee5.put(LAST_NAME, "Jackson");
        employee5.put(SPACING1, "\t");
        employee5.put(POSITION, "DBA");
        employee5.put(SPACING2, "\t\t\t\t");
        employee5.put(SEPARATION_DATE, "");
        employeeRecords.add(employee5);

        Map<String, String> employee6 = new HashMap<>();
        employee6.put(FIRST_NAME, "Sally");
        employee6.put(LAST_NAME, "Weber");
        employee6.put(SPACING1, "\t\t\t");
        employee6.put(POSITION, "Web Developer");
        employee6.put(SPACING2, "\t\t");
        employee6.put(SEPARATION_DATE, "2015-12-18");
        employeeRecords.add(employee6);
    }

    public void displayEmployees()
    {
        String stringBuilder = IntStream
            .range(0, employeeRecords.size())
            .mapToObj(this::buildEmployeeRow)
            .collect(Collectors.joining("", ("""
                Name                | Position          | Separation Date
                --------------------|-------------------|----------------
                """), ""));

        output(stringBuilder);
    }

    public String buildEmployeeRow(int i)
    {
        Map<String, String> row = employeeRecords.get(i);
        return MessageFormat.format(
            "{0} {1}{2}| {3}{4}| {5}\n",
            row.get(FIRST_NAME),
            row.get(LAST_NAME),
            row.get(SPACING1),
            row.get(POSITION),
            row.get(SPACING2),
            row.get(SEPARATION_DATE)
        );
    }

    public void sortEmployeeRecords()
    {
        employeeRecords.sort(Comparator.comparing(m -> m.get(LAST_NAME)));
    }

    public void output(String message)
    {
        System.out.println(message);
    }
}
