package lab3;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LightJavaTest {

    private LightJava light;

    @BeforeEach
    public void setUp() {
        light = new LightJava();
    }

    @AfterEach
    public void tearDown() {
  
        light = null;
    }

    @Test
    public void testTurnOn() {
        // Turn on the light
        light.turnOn();

        // Check if the light is on
        assertTrue(light.isOn());
    }

    @Test
    public void testTurnOff() {
        // Turn on the light first
        light.turnOn();

        // Turn off the light
        light.turnOff();

        // Check if the light is off
        assertFalse(light.isOn());
    }

    @Test
    public void testIsOnInitially() {
        // Check if the light is initially off
        assertFalse(light.isOn());
    }
}
