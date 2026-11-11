package com.pluralsight;

import java.time.LocalDate;

public class Employee {

    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;
    private int startTime;
    private int outTime;


    public Employee(String employeeId, String name, String department, double payRate, int hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }


    //Regular hours are 40 and if it's less than 40 return the hours worked
    public double getRegularHours() {
        if (this.hoursWorked <= 40) {
            return this.hoursWorked;
        } else {
            return 40;
        }
    }

    public double getOvertimeHours() {
        if (this.hoursWorked <= 40) {
            return 0;
        } else {
            return this.hoursWorked - 40;
        }
    }

    public double getTotalPay() {
        return (this.getRegularHours() * this.payRate) + (this.getOvertimeHours() * this.payRate * 1.5);
    }

    public String getEmployeeId() {

    }

    public void punchIn(int time) {
        this.startTime = time;

    }

    public void punchOut(int time) {
        int hoursWorkedThisShift = 0;
        this.outTime = time;


        if (outTime > startTime) {
            hoursWorkedThisShift = (24 - outTime) + startTime;
        }
        else {
            hoursWorkedThisShift = startTime - outTime;
        }
    }

}