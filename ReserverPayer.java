import java.util.ArrayList;
import java.util.List;

class ReserverPayer {
    private String creditCardDetails; 
    private String id; 
    // Resolved Warning: Specified the generic type <Reservation>
    private List<Reservation> reservations = new ArrayList<>(); 

    public ReserverPayer(String creditCard, String identity) {
        // Defensive: Format validation
        if (creditCard == null || !creditCard.contains("-")) 
            throw new IllegalArgumentException("Invalid Credit Card format (must contain hyphens)");
        if (identity == null || identity.trim().isEmpty()) 
            throw new IllegalArgumentException("Identity/ID is required");
        
        this.creditCardDetails = creditCard;
        this.id = identity;
    }
    // Logic Fix: Use instance list 'this.reservations'
    public void addReservation(Reservation r) {
        this.reservations.add(r);
    }

    public void create() {
        System.out.println("ReserverPayer profile active."); 
    }
}