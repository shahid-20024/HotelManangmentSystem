import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== STARTING HOTEL MANAGEMENT SYSTEM ===\n");

        // 1. Initialize Hotel Chain
        HotelChain myChain = new HotelChain();

        // 2. Create Hotel and Infrastructure
        Hotel luxuryHotel = new Hotel("The Grand Palace");
        RoomType suiteType = new RoomType("Executive Suite", 450.0);
        Room room404 = new Room(404);

        luxuryHotel.addRoomType(suiteType);
        luxuryHotel.addRoom(room404);

        // 3. Add Hotel to Chain
        myChain.addHotel(luxuryHotel);

        // 4. Create a Customer (ReserverPayer)
        ReserverPayer customer = myChain.createReserverPayer("4532-XXXX-1122", "CNIC-3310-01");

        // 5. Setup Reservation Dates
        Calendar cal = Calendar.getInstance();
        Date checkInDate = cal.getTime();
        cal.add(Calendar.DAY_OF_MONTH, 5);
        Date checkOutDate = cal.getTime();

        // 6. Execute Reservation Process
        Reservation myRes = new Reservation(9988, checkInDate, checkOutDate);
        myChain.makeReservation(luxuryHotel, customer, myRes);

        // 7. Track "HowMany" rooms booked
        HowMany count = new HowMany(1);
        System.out.println("Confirmed booking for " + count.getNumber() + " room(s).");

        // 8. Guest Check-in
        System.out.println("\n--- Guest Arriving ---");
        myChain.checkInGuest(room404, "Syed Saad", "Phase 6, Karachi");

        // 9. End of stay operations
        myChain.checkOutGuest();
        myChain.cancelReservation(); // Demonstrate method availability

        System.out.println("\n=== SYSTEM FLOW COMPLETE ===");
    }
}
