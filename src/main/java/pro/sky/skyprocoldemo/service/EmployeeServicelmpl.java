package pro.sky.skyprocoldemo.service;

import org.springframework.stereotype.Service;
import pro.sky.skyprocoldemo.model.Employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class EmployeeServicelmpl implements  EmployeeService {
   private final List<Employee> employeeList = new ArrayList();
    @Override
    public Employee add(String firstName, String LastName) {
       Employee employee = new Employee(firstName, LastName);
       employeeList.add(employee);
       return employee;
    }

    @Override
    public Employee  remove(String firstName, String LastName) {
        Employee employee = new Employee(firstName, LastName);
        employeeList.remove(employee);
        return employee;
    }
    @Override
    public Employee find(String firstName, String LastName) {
        return null;

    }

    @Override
    public Collection<Employee> findAll() {
        return employeeList;
    }
}
