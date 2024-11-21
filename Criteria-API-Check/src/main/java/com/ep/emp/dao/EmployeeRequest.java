package com.ep.emp.dao;


public class EmployeeRequest {

    private int empId;

    public EmployeeRequest() {}

    public EmployeeRequest(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }


    @Override
    public String toString() {
        return "EmployeeRequest{" +
                "empId=" + empId +
                '}';
    }
}
