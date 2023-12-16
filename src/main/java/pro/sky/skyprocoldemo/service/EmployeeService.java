package pro.sky.skyprocoldemo.service;

import pro.sky.skyprocoldemo.model.Employee;

import java.util.Collection;

public interface EmployeeService {
    Employee add(String firstName, String LastName);
    Employee remove(String firstName, String LastName);
    Employee find(String firstName, String LastName);
    Collection<Employee> findAll();
}
