import org.junit.Test;
import java.util.Date;
import static org.junit.Assert.*;

public class ReservationTest {
    @Test
    public void testReservationFlow() {
        // Arrange
        Date start = new Date();
        Date end = new Date(start.getTime() + 86400000); // +1 day
        
        // Act
        Reservation res = new Reservation(1001, start, end);
        
        // Assert
        assertNotNull(res);
        res.create();
    }
}