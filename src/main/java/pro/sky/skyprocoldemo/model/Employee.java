package pro.sky.skyprocoldemo.model;

import java.util.Objects;
import java.util.Random;

public class Employee {
    private String firstName;
    private String lastName;
    private Integer salary;
    private Integer depatrmentId;
    private  final Random random =new Random();

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = random.nextInt(1000) + 1000;
        this.depatrmentId = random.nextInt(5) + 1;
    }

    public Employee(String firstName, String lastName, Integer salary, Integer depatrmentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.depatrmentId = depatrmentId;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getDepatrmentId() {
        return depatrmentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setDepatrmentId(Integer depatrmentId) {
        this.depatrmentId = depatrmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(salary, employee.salary) && Objects.equals(depatrmentId, employee.depatrmentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, salary, depatrmentId);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", depatrmentId=" + depatrmentId +
                '}';
    }
}
