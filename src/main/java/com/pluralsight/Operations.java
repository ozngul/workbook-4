package com.pluralsight;

public class Operations {
    public static void main(String[] args) {
        // ROOM test
        Room room = new Room(2, 120.0, false, false);
        System.out.println("Room available: " + room.isAvailable());
        room.checkIn();
        room.checkOut();
        room.cleanRoom();

        System.out.println();

        // RESERVATION test
        Reservation reservation = new Reservation("King", 3, true);
        System.out.printf("Total reservation cost: $%.2f%n", reservation.getReservationTotal());

        System.out.println();

        // EMPLOYEE test — overload gösterimi
        Employee employee = new Employee("E101", "Muhittin", "Housekeeping", 20.0, 0);

        // 1. punchIn(double time) → manuel saat girildi
        employee.punchIn(9.0);  // 09:00 giriş
        // 2. punchOut(double time)
        employee.punchOut(17.0); // 17:00 çıkış (8 saat)

        System.out.println();

        // 3. punchIn() → overloading: sistem saatini otomatik alır
        employee.punchIn(); // sistem saatiyle giriş
        // (birkaç saniye sonra çıkış simülasyonu için beklemeye gerek yok)
        employee.punchOut(); // sistem saatiyle çıkış

        System.out.println();

        // 4. BONUS: punchTimeCard(double time) → aynı metotla giriş/çıkış
        employee.punchTimeCard(10.0); // giriş
        employee.punchTimeCard(13.5); // çıkış (3.5 saat)

        System.out.println();

        // Sonuçları göster
        System.out.printf("Total hours worked: %.2f%n", employee.getRegularHours() + employee.getOvertimeHours());
        System.out.printf("Total pay: $%.2f%n", employee.getTotalPay());
    }
}
