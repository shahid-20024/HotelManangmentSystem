class ReserverPayer {
    private String creditCardDetails; 
    private String id; 
    private List<Reservation> reservations = new ArrayList<>(); 

    public ReserverPayer(String creditCard, String identity) {
        this.creditCardDetails = creditCard; 
        this.id = identity; 
    }

    public void addReservation(Reservation r) {
        reservations.add(r);
    }

    public void create() {
        System.out.println("ReserverPayer profile active."); 
    }
}