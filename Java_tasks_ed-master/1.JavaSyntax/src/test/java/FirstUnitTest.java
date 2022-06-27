import  com.javarush.task.task01.task0131.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstUnitTest {

    @Test
    public void shouldReturnCorrectValue() {
        assertEquals(1, Solution.getMetreFromCentimetre(100), 0);
    }

    @Test
    public void shouldReturnZeroValue() {
        assertEquals(0, Solution.getMetreFromCentimetre(0), 0);
    }

    @Test
    public void shouldReturnFloatValue() {
        assertEquals(1.05, Solution.getMetreFromCentimetre(105), 0.000001);
    }

}