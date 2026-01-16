import java.util.ArrayList;
import java.util.List;

class Hotel {
    private String name;
    private List<Room> rooms = new ArrayList<>();
    private List<RoomType> roomTypes = new ArrayList<>();
    private int currentBookings = 0; // Tracking for defensive logic

    public Hotel(String name) {
        this.name = name;
    }

   // Change getname() to getName()
    public String getName() {
        return name;
    }

    public boolean available() {
        // Defensive: Check if all rooms are occupied
        return currentBookings < rooms.size();
    }

    public void createReservation() {
        if (!available()) {
            throw new IllegalStateException("Hotel " + name + " is fully booked!");
        }
        currentBookings++;
        System.out.println("Booking confirmed at " + name);
    }

    public void addRoom(Room r) { rooms.add(r); }
    public void addRoomType(RoomType rt) { roomTypes.add(rt); }
}