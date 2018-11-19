package com.collections.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Employee> employees = new ArrayList<>();
        CollectionsExample collectionsExample = new CollectionsExample();
        EmployeeCompator employeeCompator = new EmployeeCompator();
        System.out.println(collectionsExample.getEmployeeMap());
        employees.add(new Employee(78,"Shruthi","ng@gmial",RandomDOB.generateDOB()));
        employees.add(new Employee(56,"Antony","faf@hitagmail",RandomDOB.generateDOB()));
        employees.add(new Employee(67,"Bira","faf@hitagmail",RandomDOB.generateDOB()));
        employees.add(new Employee(34,"Zebra","dsf@hitagmail",RandomDOB.generateDOB()));
        Collections.sort(employees);
        System.out.println(employees);
        System.out.println("Sorting based on the name");
        Collections.sort(employees,employeeCompator);
        System.out.println(employees);
        Sender snd = new Sender();
        ChildThread t1 = new ChildThread("Hello",snd);
        ChildThread t2 = new ChildThread("Bye",snd);
        t1.start();
        t2.start();
        try
        {
            t1.join();
            t2.join();
        }
        catch(Exception e)
        {
            System.out.println("Interrupted");
        }
    }
}
