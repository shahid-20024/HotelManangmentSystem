import org.junit.Test;
import static org.junit.Assert.*;

public class HowManyTest {
    @Test
    public void testGetNumber() {
        // Arrange
        int expectedNumber = 5;
        HowMany hm = new HowMany(expectedNumber);
        
        // Act
        int actualNumber = hm.getNumber();
        
        // Assert
        assertEquals(expectedNumber, actualNumber);
    }
}