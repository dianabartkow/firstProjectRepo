package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class EmployeeTaskImpl implements EmployeeTask {

    private List<Employee> employees;

    public EmployeeTaskImpl() {
        employees= new ArrayList<>();
    }

    public EmployeeTaskImpl(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void removeById(Long iD) {
        for (Employee employee : employees) {
            if (employee.getiD().equals(iD)) {
                employees.remove(employee);
            }

        }

    }

    public void addAllEmployees(List<Employee> employeeList) {
        employees.addAll(employeeList);
    }

    @Override
    public List<Employee> sortByAge() {
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getAge()-o2.getAge();
            }
        });return employees;

    }

    public List<Employee> sortByExperience() {
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getExperience() - o2.getExperience();
            }
        });
        return employees;
    }

    public List<Employee> sortBySurname(){
       employees.sort(new Comparator<Employee>() {
           @Override
           public int compare(Employee o1, Employee o2) {
               return o1.getSurname().compareTo(o2.getSurname());
           }
       });return employees;
    }

}


