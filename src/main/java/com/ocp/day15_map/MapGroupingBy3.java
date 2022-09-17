package com.ocp.day15_map;

import java.util.ArrayList;
import static java.util.Comparator.comparing;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;

public class MapGroupingBy3 {
    public static void main(String[] args) {
        List<Employee> roster = new ArrayList<>(
                List.of(new Employee("John", "IT", 40000), 
                        new Employee("Mary", "Sales", 60000), 
                        new Employee("Jack", "IT", 50000), 
                        new Employee("Rose", "Manger", 70000), 
                        new Employee("Bob", "Sales", 30000), 
                        new Employee("Jim", "Manger", 80000), 
                        new Employee("Helen", "Manger", 60000))
        );
        System.out.println(roster);
        Map<String, Optional<Employee>> m4 = roster.stream()
                                                   .collect(groupingBy(Employee::getNeighborhood, maxBy(comparing(Employee::getSalary))));
                
        System.out.println(m4);
    }
}
