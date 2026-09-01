package streamString;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeStreamApi {

    public static void main(String[] arg) {


        List<EmployeeEntity> employees = new ArrayList<>();

        employees.add(new EmployeeEntity(1, "Munna", "Finance", 120000.0, 30, "Gurgaon"));
        employees.add(new EmployeeEntity(2, "Rahul", "IT", 95000.0, 28, "Delhi"));
        employees.add(new EmployeeEntity(3, "Priya", "HR", 85000.0, 32, "Noida"));
        employees.add(new EmployeeEntity(4, "Amit", "Finance", 150000.0, 40, "Mumbai"));
        employees.add(new EmployeeEntity(5, "Munna", "Operations", 90000.0, 29, "Pune"));


        double sum = employees.stream().mapToDouble(EmployeeEntity::getSalary).sum();

        System.out.println("Total Salary of all Employee==>" + sum);

        //sort the employee descending order by salary

        List<EmployeeEntity> list = employees.stream().sorted(Comparator.comparing(EmployeeEntity::getSalary).reversed()).toList();
        System.out.println("Employee sorted by salary in Descending order ==>" + list);


        // Get Employee salary according to Dept
        Map<String, Double> payroll =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                EmployeeEntity::getDepartment,
                                Collectors.summingDouble(EmployeeEntity::getSalary)));

        System.out.println("Employee Salary Dept by==>" + payroll);

        // Count the employee by Dept
        Map<String, Long> empDeptCount = employees.stream()
                .collect(Collectors.groupingBy(EmployeeEntity::getDepartment, Collectors.counting()));
        System.out.println("Employee details by Dept==>" + empDeptCount);

        // Find highest paid Employee

        String highestPaidEmployee = employees.stream().max(Comparator.comparing(EmployeeEntity::getSalary))
                .map(EmployeeEntity::getName).orElse(null);
        System.out.println("Highest paid Employee===>" + highestPaidEmployee);

        //Get highest paid salary in dept Name;

        String deptName = employees.stream().max(Comparator.comparing(EmployeeEntity::getSalary))
                .map(EmployeeEntity::getDepartment).orElse(null);
        System.out.println("Highest paid Department==>" + deptName);

        String empName = employees.stream().min(Comparator.comparing(EmployeeEntity::getSalary)).map(EmployeeEntity::getName)
                .orElse("no employee");
        System.out.println("Lowest paid employee==>"+empName);


        // employee name from Finance dept

        List<String> empList = employees.stream().filter(employeeEntity -> employeeEntity.getDepartment().equals("Finance"))
                .map(EmployeeEntity::getName).toList();

        System.out.println("Employee list from Finance Dept==>" + empList);

        // Find Top n paid employee
        List<EmployeeEntity> topPaidList = employees.stream().sorted(Comparator
                .comparing(EmployeeEntity::getSalary).reversed()).limit(2).toList();
        System.out.println("Top paid employee are ===>" + topPaidList);

        // Employee Group by Dept

        Map<String, List<EmployeeEntity>> deptEmp = employees.stream().collect(Collectors.groupingBy(EmployeeEntity::getDepartment));

        System.out.println("Employee group by Dept==>" + deptEmp);


        // Highest Salary in Each Dept

        Map<String, Optional<EmployeeEntity>> highestDept = employees.stream().collect(Collectors
                .groupingBy(EmployeeEntity::getDepartment, Collectors.maxBy(Comparator.comparing(EmployeeEntity::getSalary))));

        System.out.println("Highest salary in Each Dept==>" + highestDept);

// find the list of employee name in each department
        Map<String, List<String>> employeeRecord = employees.stream().collect(Collectors.groupingBy(EmployeeEntity::getDepartment, Collectors
                .mapping(EmployeeEntity::getName, Collectors.toList())));

        System.out.println("Employee Record=====>" + employeeRecord);


        // find the list of employee name in given  department
        Map<String, List<String>> employeeRecord1 = employees.stream().filter(employeeEntity -> employeeEntity.getDepartment().equals("Finance")).
                collect(Collectors.groupingBy(EmployeeEntity::getDepartment, Collectors
                        .mapping(EmployeeEntity::getName, Collectors.toList())));

        System.out.println("Employee in Each Department==>" + employeeRecord1);



        // Group  the Employee name according the first letter

        Map<Character, List<String>> empNameByFirstChar = employees.stream()
                .collect(Collectors.groupingBy(
                        employee -> employee.getName().charAt(0)
                ,Collectors.mapping(EmployeeEntity::getName,Collectors.toList())));

        System.out.println( "Employee's name list Group by First Letter"+empNameByFirstChar);


//        Map<String, List<EmployeeEntity>> collect = employees.stream().collect(Collectors.groupingBy(employee->employee.getName().charAt(0)));
//
    }

}
