package InterviewLearningMiniProjects;

import java.util.*;
import java.util.stream.*;

public class StreamOperations {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee("Ankit", "IT", 350000),
                new Employee("Ravi", "IT", 400000),
                new Employee("Sita", "HR", 300000),
                new Employee("Gita", "Finance", 450000),
                new Employee("Rahul", "IT", 500000));

        // 1. Filter IT employees
        List<Employee> itEmp = employees.stream().filter(n -> n.getDept().equalsIgnoreCase("IT"))
                .collect(Collectors.toList());

        // 2. Sort by salary descending
        List<Employee> sortedIncome = employees.stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary())).collect(Collectors.toList());

        List<Employee> sortedIncome2 = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .collect(Collectors.toList());
        // Note: sortedIncome2 is an alternative way to sort by salary in descending
        // order

        // 3. Group by department
        Map<String, List<Employee>> groupedByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept));

        // Counting
        Map<String, Long> countByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));

        // Average salary of employees in each department
        Map<String, Double> averageSalary = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept, Collectors.averagingDouble(Employee::getSalary)));

        System.out.println("IT Employees:");

        itEmp.forEach(emp -> System.out.println(emp.getName() + " - " + emp.getDept() + " - " + emp.getSalary()));

        System.out.println("Sorted Employees by Salary (Descending):");

        sortedIncome
                .forEach(emp -> System.out.println(emp.getName() + " - " + emp.getDept() + " - " + emp.getSalary()));

        System.out.println("Employees grouped by Department:");

        groupedByDept.forEach((dept, empList) -> {
            System.out.println("Department: " + dept);
            empList.forEach(emp -> System.out.println(emp.getName() + " - " + emp.getSalary()));
        });

        System.out.println("Count of Employees by Department:");
        countByDept.forEach((dept, count) -> {
            System.out.println("Department: " + dept + " - Count: " + count);
        });
        System.out.println("Average Salary by Department:");
        averageSalary.forEach((dept, avg) -> {
            System.out.println("Department: " + dept + " - Average Salary: " + avg);
        });
    }
}

class Employee {
    String name;
    String dept;
    double salary;

    Employee(String name, String dept, double salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public double getSalary() {
        return salary;
    }
}
