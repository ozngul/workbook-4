package com.pluralsight;

public class Operations {
    public static void main(String[] args) {
        Room room = new Room(2, 120.0, false, false);
        System.out.println("Room available: " + room.isAvailable());

        Reservation reservation = new Reservation("King", 3, true);
        System.out.printf("Total reservation cost: $%.2f%n", reservation.getReservationTotal());

        Employee employee = new Employee("E101", "Alice", "Housekeeping", 20.0, 45.0);
        System.out.println("Employee total pay: $" + employee.getTotalPay());
    }
}
