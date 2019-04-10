package com.sda.tdd;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {

    @Test
    public void testGetEmployeesInIT() {
        Employee testEmployee = new Employee();
        testEmployee.setDepartmentofEmployee(Employee.Department.IT);

        EmployeeLists employeeLists = new EmployeeLists();
        employeeLists.addEmployeesToITDep(testEmployee);

        Employee.Department department = employeeLists.getEmployeesInIT().get(0).getDepartmentofEmployee();
        Assert.assertEquals("IT", department.toString());

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetEmployeesInITShouldThrowException() {
        Employee testEmployee = new Employee();
        testEmployee.setDepartmentofEmployee(Employee.Department.MARKETING);

        EmployeeLists employeeLists = new EmployeeLists();
        employeeLists.addEmployeesToITDep(testEmployee);

        Employee.Department department = employeeLists.getEmployeesInIT().get(0).getDepartmentofEmployee();

    }

    @Test
    public void testGetEmployeesInITListSize() {
        Employee testEmployee = new Employee();
        Employee testEmployee2 = new Employee();
        testEmployee.setDepartmentofEmployee(Employee.Department.IT);
        testEmployee2.setDepartmentofEmployee(Employee.Department.IT);

        EmployeeLists employeeLists = new EmployeeLists();

        employeeLists.addEmployeesToITDep(testEmployee);
        employeeLists.addEmployeesToITDep(testEmployee2);

        int lengthOfList = employeeLists.getEmployeesInIT().size();
        Assert.assertEquals(2, lengthOfList);


    }
}

