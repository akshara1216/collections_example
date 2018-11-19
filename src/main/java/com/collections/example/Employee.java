package com.collections.example;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.time.LocalDate;

public class Employee implements Comparable<Employee>{
    private int employeeID;
    private String employeeName;
    private String employeeEmail;
    private LocalDate employeeDOB;

    public Employee() {
    }

    public Employee(int employeeID, String employeeName, String employeeEmail, LocalDate employeeDOB) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.employeeDOB = employeeDOB;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public LocalDate getEmployeeDOB() {
        return employeeDOB;
    }

    public void setEmployeeDOB(LocalDate employeeDOB) {
        this.employeeDOB = employeeDOB;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public int compareTo(Employee employee) {
        return this.getEmployeeID() - employee.getEmployeeID();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return new EqualsBuilder()
                .append(employeeID, employee.employeeID)
                .append(employeeName, employee.employeeName)
                .append(employeeEmail, employee.employeeEmail)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(employeeID)
                .append(employeeName)
                .append(employeeEmail)
                .toHashCode();
    }
    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("employeeID", employeeID)
                .append("employeeName", employeeName)
                .append("employeeEmail", employeeEmail)
                .append("employeeDOB", employeeDOB)
                .toString();
    }
}
