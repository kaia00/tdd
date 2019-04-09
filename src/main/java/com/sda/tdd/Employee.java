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

}

class EmployeeLists {

    private List<Employee> employeesInIT = new ArrayList<Employee>();

    Employee employee = new Employee();

    public void addEmployeesToITDep(Employee employee) {
        if (employee.getDepartmentofEmployee().equals("IT")) {
            employeesInIT.add(employee);
        }
    }

    public List<Employee> getEmployeesInIT() {
        try {
            return employeesInIT;
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException();
        }

    }
}





