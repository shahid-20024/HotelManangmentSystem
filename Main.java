import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== FINAL COMPLETE HOTEL MANAGEMENT SYSTEM (DEFENSIVE VERSION) ===\n");

        HotelChain myChain = new HotelChain();

        try {
            // 1. SETUP ROOM TYPES (Refactored with Defensive Checks)
            System.out.println("--- 1. Initializing Room Types ---");
            RoomType luxurySuite = new RoomType("Luxury Suite", 550.0);
            RoomType standardRoom = new RoomType("Standard Double", 150.0);
            
            // Testing Wrong Logic: Negative Cost
            try {
                RoomType errorType = new RoomType("Free Room", -10.0);
            } catch (IllegalArgumentException e) {
                System.err.println("[Defensive Check]: Caught invalid cost: " + e.getMessage());
            }

            // 2. SETUP HOTELS & INFRASTRUCTURE
            System.out.println("\n--- 2. Initializing Hotels & Rooms ---");
            Hotel h1 = new Hotel("Serena Palace");
            Hotel h2 = new Hotel("Marriott International");
            Hotel h3 = new Hotel("Regent Plaza");

            // Register Room Types to Hotels
            h1.addRoomType(luxurySuite);
            h2.addRoomType(standardRoom);
            h3.addRoomType(luxurySuite);

            // Add Rooms
            Room r101 = new Room(101);
            Room r102 = new Room(102);
            h1.addRoom(r101);
            h1.addRoom(r102);
            
            h2.addRoom(new Room(201));
            h3.addRoom(new Room(301));

            myChain.addHotel(h1);
            myChain.addHotel(h2);
            myChain.addHotel(h3);

            // 3. CREATE CUSTOMERS (ReserverPayers)
            System.out.println("\n--- 3. Creating Reserver Profiles ---");
            ReserverPayer p1 = myChain.createReserverPayer("4532-1122", "Guest-ID-01");
            ReserverPayer p2 = myChain.createReserverPayer("9876-4433", "Guest-ID-02");
            ReserverPayer p3 = myChain.createReserverPayer("1122-3344", "Guest-ID-03");

            // 4. BOOKING PROCESS (Including HowMany)
            System.out.println("\n--- 4. Executing Reservations ---");
            Calendar cal = Calendar.getInstance();
            Date checkIn = cal.getTime();
            cal.add(Calendar.DAY_OF_MONTH, 5);
            Date checkOut = cal.getTime();

            // First Booking
            Reservation res1 = new Reservation(7001, checkIn, checkOut);
            myChain.makeReservation(h1, p1, res1);
            
            // Using HowMany Association Logic
            HowMany hMany = new HowMany(1);
            System.out.println("Status: Reserved " + hMany.getNumber() + " room at " + h1.getName());

            // 5. DOUBLE-BOOKING / AVAILABILITY TEST
            System.out.println("\n--- 5. Testing Availability Logic ---");
            // If Hotel 1 only had 2 rooms and we try to book 3...
            Reservation res2 = new Reservation(7002, checkIn, checkOut);
            Reservation res3 = new Reservation(7003, checkIn, checkOut);
            
            myChain.makeReservation(h1, p2, res2); // Booking room 2
            
            System.out.println("Attempting 3rd booking for Hotel with only 2 rooms...");
            if (h1.available()) {
                myChain.makeReservation(h1, p3, res3);
            } else {
                System.err.println("[Defensive Check]: Hotel " + h1.getName() + " is currently FULL.");
            }

            // 6. GUEST CHECK-IN & ERROR HANDLING
            System.out.println("\n--- 6. Guest Arrivals & Check-In ---");
            // Success
            myChain.checkInGuest(r101, "Syed Saad", "DHA Karachi");
            
            // Testing Wrong Logic: Null Room Reference
            try {
                myChain.checkInGuest(null, "Error Guest", "None");
            } catch (Exception e) {
                System.err.println("[Defensive Check]: Caught Null Room Error: " + e.getMessage());
            }

            // 7. FINAL OPERATIONS
            System.out.println("\n--- 7. System Cleanup ---");
            myChain.checkOutGuest();
            myChain.cancelReservation();

        } catch (Exception e) {
            System.err.println("Fatal System Failure: " + e.getLocalizedMessage());
        }

        System.out.println("\n=== ALL PROCESSES COMPLETED SUCCESSFULLY ===");
    }
}