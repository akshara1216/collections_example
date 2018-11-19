package com.collections.example;

import java.util.Comparator;

public class EmployeeCompator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getEmployeeName().compareTo(e2.getEmployeeName());
    }

}
