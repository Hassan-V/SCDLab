package lab3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    public void testDefaultConstructor() {
        Rectangle rectangle = new Rectangle();
        assertEquals(1.0, rectangle.getLength(), "Default length should be 1");
        assertEquals(1.0, rectangle.getWidth(), "Default width should be 1");
        assertEquals(1.0, rectangle.getArea(), "Default area should be 1 (1 * 1)");
    }

    @Test
    public void testParameterizedConstructor() {
        Rectangle rectangle = new Rectangle(5.0, 4.0);
        assertEquals(5.0, rectangle.getLength(), "Length should be initialized to 5");
        assertEquals(4.0, rectangle.getWidth(), "Width should be initialized to 4");
        assertEquals(20.0, rectangle.getArea(), "Area should be 20 (5 * 4)");
    }

    @Test
    public void testSettersAndGetters() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(7.0);
        rectangle.setWidth(3.0);
        assertEquals(7.0, rectangle.getLength(), "Length should be 7 after setting");
        assertEquals(3.0, rectangle.getWidth(), "Width should be 3 after setting");
        assertEquals(21.0, rectangle.getArea(), "Area should be 21 (7 * 3)");
    }

    @Test
    public void testGetArea() {
        Rectangle rectangle = new Rectangle(6.0, 8.0);
        assertEquals(48.0, rectangle.getArea(), "Area should be 48 (6 * 8)");
    }
}