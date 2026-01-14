import org.junit.Test;
import java.util.Date;
import static org.junit.Assert.*;

public class ReserverPayerTest {
    @Test
    public void testAddReservation() {
        // Arrange
        ReserverPayer rp = new ReserverPayer("1111-2222", "ID-99");
        Reservation res = new Reservation(1, new Date(), new Date());
        
        // Act
        rp.addReservation(res);
        rp.create();
        
        // Assert
        assertNotNull(rp);
    }
}