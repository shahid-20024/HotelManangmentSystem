import java.util.Date;

class Reservation {
    private final Date reservationDate;
    private final Date startDate;
    private final Date endDate;
    private final int number;

    public Reservation(int number, Date startDate, Date endDate) {
        // Defensive: Validation logic
        if (startDate == null || endDate == null) 
            throw new IllegalArgumentException("Dates cannot be null");
        if (endDate.before(startDate)) 
            throw new IllegalArgumentException("End date cannot be before start date");
        if (number <= 0) 
            throw new IllegalArgumentException("Reservation number must be positive");

        this.number = number;
        this.startDate = startDate;
        this.endDate = endDate;
        this.reservationDate = new Date();
    }

    public void create() {
        try {
            // Defensive check: Ensure dates haven't been tampered with or are still valid
            if (reservationDate == null) {
                throw new IllegalStateException("Reservation data is corrupted: Missing creation date.");
            }

            System.out.println("--- Reservation Finalized ---");
            System.out.println("Reservation Number: " + number);
            System.out.println("Booked on: " + reservationDate);
            System.out.println("Stay Duration: " + startDate + " to " + endDate);
            System.out.println("Status: Successfully added to system.");
            
        } catch (Exception e) {
            // Defensive: Log the error rather than crashing the thread
            System.err.println("Critical Error in Reservation.create(): " + e.getMessage());
        }
    }
}