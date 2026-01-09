class Reservation {
    private Date reservationDate;
    private Date startDate;
    private Date endDate;
    private int number; 

    public Reservation(int number, Date startDate, Date endDate) {
        this.number = number;
        this.startDate = startDate;
        this.endDate = endDate;
        this.reservationDate = new Date();
    }

    public void create() { }
}