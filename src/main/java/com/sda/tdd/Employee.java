package com.sda.tdd;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private String ID;
    private String departmentofEmployee;


    public enum Department {
        IT, FINANCE, PRODUCTION, MARKETING, HR;

    }

    public String getDepartmentofEmployee() {
        return departmentofEmployee;
    }

    public void setDepartmentofEmployee(String departmentofEmployee) {
        this.departmentofEmployee = departmentofEmployee;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    List<Employee> employeesInIT = new ArrayList<Employee>();

    public List<Employee> addEmployeesToITDep(Employee employee) {
        if (departmentofEmployee.equals("IT")) {
            employeesInIT.add(employee);
        }
        return employeesInIT;
    }

    public List<Employee> getEmployeesInIT() {
        try {
            return employeesInIT;
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException();
        }

    }
}


