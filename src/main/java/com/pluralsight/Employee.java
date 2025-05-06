package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private Double punchInTime = null;

    public Employee(String employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    // punchIn (manual)
    public void punchIn(double time) {
        punchInTime = time;
        System.out.printf("%s punched in at %.2f (manual)%n", name, time);
    }

    // punchIn (current time)
    public void punchIn() {
        LocalDateTime now = LocalDateTime.now();
        double time = now.getHour() + (now.getMinute() / 60.0);
        punchIn(time);
    }

    // punchOut (manual)
    public void punchOut(double time) {
        if (punchInTime != null) {
            double worked = time - punchInTime;
            hoursWorked += worked;
            System.out.printf("%s punched out at %.2f (manual), worked %.2f hours.%n", name, time, worked);
            punchInTime = null;
        } else {
            System.out.println("Error: punchIn was not called.");
        }
    }

    // punchOut (current time)
    public void punchOut() {
        LocalDateTime now = LocalDateTime.now();
        double time = now.getHour() + (now.getMinute() / 60.0);
        punchOut(time);
    }

    // ✅ punchTimeCard (BONUS: tek metotla giriş/çıkış yapar)
    public void punchTimeCard(double time) {
        if (punchInTime == null) {
            punchIn(time);
        } else {
            punchOut(time);
        }
    }

    public double getRegularHours() {
        return hoursWorked <= 40 ? hoursWorked : 40;
    }

    public double getOvertimeHours() {
        return hoursWorked > 40 ? hoursWorked - 40 : 0;
    }

    public double getTotalPay() {
        return getRegularHours() * payRate + getOvertimeHours() * payRate * 1.5;
    }
}
