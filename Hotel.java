private String name; 
    private List<Room> rooms = new ArrayList<>();
    private List<RoomType> roomTypes = new ArrayList<>();

    public Hotel(String name) {
        this.name = name;
    }

    public void createReservation() { }
    public boolean available() { return true; }