class HotelChain {
    private List<Hotel> hotels = new ArrayList<>(); 
    private List<ReserverPayer> reserverPayers = new ArrayList<>(); 
    
    public void makeReservation(Hotel h, ReserverPayer rp, Reservation res) {
        if (canMakeReservation()) {
            h.createReservation();
            rp.addReservation(res);
            res.create();
        }
    }

    public void cancelReservation() { 
        if (canCancelReservation()) { 
            System.out.println("Reservation Cancelled.");
        }
    }

    public void checkInGuest(Room r, String name, String addr) {
        if (canCheckInGuest()) { 
            r.createGuest(name, addr);
        }
    }

    public void checkOutGuest() {
        if (canCheckOutGuest()) { 
            System.out.println("Guest Checked Out.");
        }
    }

    public void createReserverPayer(String card, String id) {
        ReserverPayer rp = new ReserverPayer(card, id); 
        rp.create();
        reserverPayers.add(rp);
    }

    // Private Defensive Logic Helpers (-)
    private boolean canMakeReservation() { return true; } 
    private boolean canCancelReservation() { return true; } 
    private boolean canCheckInGuest() { return true; } 
    private boolean canCheckOutGuest() { return true; } 

    public void addHotel(Hotel h) { hotels.add(h); }
}