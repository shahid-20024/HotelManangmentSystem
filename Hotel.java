class Hotel {
    private String name; 
    private List<Room> rooms = new ArrayList<>(); 
    private List<RoomType> roomTypes = new ArrayList<>(); 

    public Hotel(String name) {
        this.name = name; 
    }

    public void createReservation() {
        System.out.println("Hotel " + name + " creating reservation..."); 
    }

    public boolean available() {
        return true; 
    }

    public void addRoom(Room r) { rooms.add(r); }
    public void addRoomType(RoomType rt) { roomTypes.add(rt); }
}