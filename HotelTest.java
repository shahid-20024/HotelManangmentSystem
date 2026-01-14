import org.junit.Test;
import static org.junit.Assert.*;

public class HotelTest {
    @Test
    public void testHotelInfrastructure() {
        // Arrange
        Hotel hotel = new Hotel("Serena");
        Room r = new Room(202);
        RoomType rt = new RoomType("Single", 100.0);
        
        // Act
        hotel.addRoom(r);
        hotel.addRoomType(rt);
        boolean isAvailable = hotel.available();
        
        // Assert
        assertTrue(isAvailable);
        hotel.createReservation();
    }
}