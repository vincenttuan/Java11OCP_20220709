package com.ocp.day12_equals;

import java.util.Objects;

// 在有組合關係的體系下, 若要進行 equals() 的比對
// 則在該體系下的所有類別都要實作 equals() 與 hashCode()
// 部門
class Department {
    private String deptName;
    public Department(String deptName) {
        this.deptName = deptName;
    }
    
    // 使用精靈產生 hashCode() 與 equals() 的實作
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.deptName);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Department other = (Department) obj;
        return Objects.equals(this.deptName, other.deptName);
    }
    
    @Override
    public String toString() {
        return "部門{" + "部門名稱=" + deptName + '}';
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
    
    // 使用精靈產生 hashCode() 與 equals() 的實作
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.empName);
        hash = 89 * hash + this.salary;
        hash = 89 * hash + Objects.hashCode(this.dept);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (this.salary != other.salary) {
            return false;
        }
        if (!Objects.equals(this.empName, other.empName)) {
            return false;
        }
        return Objects.equals(this.dept, other.dept);
    }
    
    @Override
    public String toString() {
        return "員工{" + "員工姓名=" + empName + ", 員工薪資=" + salary + ", 所屬單位=" + dept + '}';
    }
    
    
}
