package com.ocp.day12_equals;

// 部門
class Department {
    private String depyName;
    public Department(String depyName) {
        this.depyName = depyName;
    }
    @Override
    public String toString() {
        return "部門{" + "部門名稱=" + depyName + '}';
    }
}

// 員工
public class Employee {
    private String empName;
    private int salary;
    private Department dept;
    public Employee(String empName, int salary, String deptName) {
        this.empName = empName;
        this.salary = salary;
        this.dept = new Department(deptName);
    }

    @Override
    public String toString() {
        return "員工{" + "員工姓名=" + empName + ", 員工薪資=" + salary + ", 所屬單位=" + dept + '}';
    }
    
    
}
