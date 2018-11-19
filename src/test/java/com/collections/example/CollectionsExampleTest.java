package com.collections.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class CollectionsExampleTest {

    CollectionsExample collectionsExample;

    @Mock
    private Map<List<String>, List<Employee>> employeeMap;

    @Mock
    Employee employee;

    @Mock
    Employee employee1;

    @Before
    public void setUp()
    {
        employeeMap = new HashMap<>();
        collectionsExample = new CollectionsExample();
         employee = new Employee();
         employee1 = new Employee();

    }

    @Test
    public void setEmployeeMapWithSingleElementinList()
    {
        setUp();
       collectionsExample.setEmployeeMap(mapData(1));

    }

    @Test
    public void insertDuplicateEmployee()
    {
        setUp();
        collectionsExample.setEmployeeMap(mapData(2));
        Assert.assertEquals("Valid Employee is inserted",1,collectionsExample.getEmployeeMap().size());
    }

    @Test
    public void setEmployeeMapWithNullMap()
    {
        setUp();
        employeeMap = null;
        collectionsExample.setEmployeeMap(null);
        Assert.assertNull("Map is null",employeeMap);
    }

    Map<List<String>,List<Employee>> mapData(int caseno)
    {
        List<String> keylist = new ArrayList<>();
        List<Employee> employees = new ArrayList<>();
        switch (caseno)
        {
            case 1:
            {
                keylist.add("Shruthi");
                employee.setEmployeeDOB(RandomDOB.generateDOB());
                employee.setEmployeeEmail("ng.shruthi@gmail.com");
                employee.setEmployeeID(1);
                employee.setEmployeeName("Shruthi");
                employees.add(employee);
                employeeMap.put(keylist,employees);
                break;
            }
            case 2:
            {
                keylist.add("Shruthi");
                employee.setEmployeeDOB(RandomDOB.generateDOB());
                employee.setEmployeeEmail("ng.shruthi@gmail.com");
                employee.setEmployeeID(1);
                employee.setEmployeeName("Shruthi");
                employees.add(employee);
                keylist.add("Shruthi");
                employee1.setEmployeeDOB(RandomDOB.generateDOB());
                employee1.setEmployeeEmail("ng.shruthi@gmail.com");
                employee1.setEmployeeID(1);
                employee1.setEmployeeName("Shruthi");
                employees.add(employee1);
                employeeMap.put(keylist,employees);
                break;
            }
        }
        return employeeMap;
    }


}
