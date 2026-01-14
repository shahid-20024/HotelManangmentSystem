import org.junit.Test;
import static org.junit.Assert.*;

public class RoomTypeTest {
    @Test
    public void testRoomTypeInitialization() {
        // Arrange & Act
        RoomType type = new RoomType("Deluxe", 250.0);
        
        // Assert
        assertNotNull(type);
    }
}