import org.junit.Test;
import static org.junit.Assert.*;

public class GuestTest {
    @Test
    public void testGuestCreation() {
        // Arrange
        String name = "John Doe";
        String address = "123 Street, NYC";
        
        // Act
        Guest guest = new Guest(name, address);
        
        // Assert
        assertNotNull(guest);
        guest.create(); // Verify no exceptions thrown
    }
}