package com.company;

import java.util.List;

public interface EmployeeTask {



    void addEmployee(Employee employee);
    void removeById(Long iD);
    void addAllEmployees(List<Employee> employeeList);

    List<Employee> getAllEmployees();
    List<Employee> sortByAge();
    List<Employee> sortByExperience();
    List<Employee> sortBySurname();


}
