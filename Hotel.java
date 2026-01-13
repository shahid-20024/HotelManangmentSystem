import java.util.ArrayList;
import java.util.List;

class Hotel {
    private String name;
    private List<Room> rooms = new ArrayList<>();
    private List<RoomType> roomTypes = new ArrayList<>();

    public Hotel(String name) {
        this.name = name;
    }

    public void createReservation() {
        System.out.println("Hotel " + name + " is processing the reservation request.");
    }

    public boolean available() {
        return true; 
    }

    public void addRoom(Room r) { rooms.add(r); }
    public void addRoomType(RoomType rt) { roomTypes.add(rt); }
}