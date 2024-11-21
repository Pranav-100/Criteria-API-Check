package com.ep.emp.dao;


import jakarta.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")  // Match database column name
    private int empId;

    @Column(name = "emp_name")  // Match database column name
    private String empName;

    @Column(name = "emp_address")  // Match database column name
    private String empAddress;

    @Column(name = "emp_mobile_number")  // Match database column name
    private String empMobileNumber;


    public Employee() {}

    public Employee(int empId, String empName, String empAddress, String empMobileNumber) {
        this.empId = empId;
        this.empName = empName;
        this.empAddress = empAddress;
        this.empMobileNumber = empMobileNumber;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public String getEmpMobileNumber() {
        return empMobileNumber;
    }

    public void setEmpMobileNumber(String empMobileNumber) {
        this.empMobileNumber = empMobileNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAddress='" + empAddress + '\'' +
                ", empMobileNumber='" + empMobileNumber + '\'' +
                '}';
    }
}
