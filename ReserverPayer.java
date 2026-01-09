class ReserverPayer {
    private String creditCardDetails; 
    private String id; 
    private List<Reservation> reservations = new ArrayList<>();

    public ReserverPayer(String creditCardDetails, String id) {
        this.creditCardDetails = creditCardDetails;
        this.id = id;
    }

    public void create() { }
}