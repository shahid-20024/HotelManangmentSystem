class Room {
    private int number; 
    private List<Guest> occupants = new ArrayList<>(); 

    public Room(int number) {
        this.number = number; 
    }

    public void createGuest(String name, String addr) {
        Guest g = new Guest(name, addr);
        g.create();
        occupants.add(g);
    }
}