package pro.sky.skyprocoldemo.service;


import org.springframework.stereotype.Service;
import pro.sky.skyprocoldemo.model.Employee;


import java.util.*;


@Service
public class EmployeeServicelmpl implements  EmployeeService {
    private final Map<String, Employee> employeeList = new HashMap<>();

    @Override
    public Employee add(String firstName, String LastName) {
        Employee employee = new Employee(firstName, LastName);
        String key = firstName + LastName;
        if (employeeList.containsKey(key)) {

        employeeList.put(key, employee);
        }
        return employee;
    }


    @Override
    public Employee remove(String firstName, String LastName) {
        String key = firstName + LastName;
        Employee employee = null;
        if (employeeList.containsKey(key)) {
            employee = employeeList.get(key);
            employeeList.remove(key);
        }
        return employee;
    }

    @Override
    public Employee find(String firstName, String LastName) {
        String key = firstName + LastName;
        Employee employee = null;
        if (employeeList.containsKey(key)) {
            employee = employeeList.get(key);
        }
        return employee;
    }


    @Override
    public Collection<Employee> findAll() {
        return employeeList.values();
    }
}