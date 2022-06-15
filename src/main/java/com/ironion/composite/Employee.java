package com.ironion.composite;

import java.util.List;

import java.util.ArrayList;

/**
 * @author ironion
 * @date 2022/6/15 11:08
 */
public class Employee {

    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    void add(Employee employee){
        if (null == subordinates){
            subordinates = new ArrayList<>();
        }
        subordinates.add(employee);
    }

    void remove(Employee employee){
        if (null == subordinates){
            return;
        }
        subordinates.remove(employee);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", subordinates=" + subordinates +
                '}';
    }
}
