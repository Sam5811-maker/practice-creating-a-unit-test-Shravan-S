package classes_and_objects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringManipulatorTest {

    String input1 = "hello";

    @Test
    public void reverseStringWorksCorrectly() {
        String msg = "reverseString correctly reverses input";
        String expected = "olleh";
        String actual = StringManipulator.reverseString(input1);
        assertEquals(expected, actual, msg);
    }

    @Test
    public void testReverseStringNull() {
        String msg = "reverseString to handle null input";
        String expected = null;
        String actual;
        actual = StringManipulator.reverseString(null);
        assertEquals(expected, actual, msg);
    }

    @Test
    public void testReverseStringEmpty() {
        String msg = "reverseString to handle empty input";
        String expected = "";
        String actual = StringManipulator.reverseString("");
        assertEquals(expected, actual, msg);
    }

}
