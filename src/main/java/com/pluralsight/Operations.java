package com.pluralsight;

public class Operations {
    public static void main(String[] args) {
        Room room = new Room(2, 120.0, false, false);
        System.out.println("Room available: " + room.isAvailable());

        //  Room room1 = new Room(1,120.0,true,false);
        //  System.out.println("Room available: " + room1.isAvailable());

        Reservation reservation = new Reservation("King", 3, true);
        System.out.printf("Total reservation cost: $%.2f%n", reservation.getReservationTotal());

         //   Reservation reserveOzan = new Reservation("Double", 5,false);
        //   System.out.printf("Total reservation cost: $%.2f%n", reserveOzan.getReservationTotal());

        Employee employee = new Employee("E101", "Alice", "Housekeeping", 20.0, 45.0);
        System.out.println("Employee total pay: $" + employee.getTotalPay());


        // Employee secondEmloyee = new Employee("10", "Ozan", "IT", 50, 40);
        //  System.out.println("secondEmloyee: " + secondEmloyee.getTotalPay());
    }
}
