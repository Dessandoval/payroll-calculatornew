package com.pluralsight;

public class Employee {

    private int employeeId;
    private String name;
    private double hours;
    private double payRate;

    public Employee(int employeeId, String name, double hours, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hours = hours;
        this.payRate = payRate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
    public double calcuateGrossPay() {
        double grossPay = hours * payRate;
        return grossPay;
    }
    public String toRow() {
        return String.format("%-5d | %-20s | %-12.1f | %-8.2f",
                employeeId, name, hours, payRate);
    }
}
