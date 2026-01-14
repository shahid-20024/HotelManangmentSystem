import org.junit.Test;
import static org.junit.Assert.*;

public class RoomTest {
    @Test
    public void testCreateGuestInRoom() {
        // Arrange
        Room room = new Room(101);
        
        // Act
        room.createGuest("Alice", "London");
        
        // Assert
        assertNotNull(room);
    }
}