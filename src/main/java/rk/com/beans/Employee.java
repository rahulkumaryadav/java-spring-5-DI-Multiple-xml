package rk.com.beans;

import org.springframework.stereotype.Component;

@Component
public class Employee {

    private String empName;

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                '}';
    }
}
