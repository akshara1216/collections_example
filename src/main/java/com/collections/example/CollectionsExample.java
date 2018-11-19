package com.collections.example;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CollectionsExample {

    private Map<List<String>,List<Employee>> employeeMap;

    public Map<List<String>, List<Employee>> getEmployeeMap() {
        return employeeMap;
    }

    public void setEmployeeMap(Map<List<String>, List<Employee>> employeeMap) {
        if(employeeMap != null)
        this.employeeMap = employeeMap;
    }

}
