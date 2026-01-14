import org.junit.Test;
import java.util.Date;
import static org.junit.Assert.*;

public class HotelchainTest {
    @Test
    public void testCompleteChainFlow() {
        // Arrange
        HotelChain chain = new HotelChain();
        Hotel h = new Hotel("Test Hotel");
        ReserverPayer rp = chain.createReserverPayer("5555", "UID-1");
        Reservation res = new Reservation(77, new Date(), new Date());
        Room r = new Room(505);
        
        // Act & Assert
        chain.addHotel(h);
        chain.makeReservation(h, rp, res);
        chain.checkInGuest(r, "Bob", "Paris");
        chain.checkOutGuest();
        chain.cancelReservation();
        
        assertNotNull(chain);
    }
}