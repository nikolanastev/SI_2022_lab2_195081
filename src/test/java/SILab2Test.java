import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {
    @Test
    void test1(){ // Every statement
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of("0", "#", "0")));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        List<String> initial = List.of("0", "#", "0", "#", "0", "#", "0", "#", "0");
        List<String> expected = List.of("2", "#", "2", "#", "4", "#", "2", "#", "2");
        assertEquals(SILab2.function(initial), expected);
    }

    @Test
    void test2(){ // Every branch
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of("0", "#", "0")));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        List<String> initial = List.of("0", "#", "0", "#", "#", "0", "#", "#", "0", "#", "0", "#", "0", "0", "0", "#");
        List<String> expected = List.of("2", "#", "3", "#", "#", "4", "#", "#", "2", "#", "3", "#", "0", "1", "1", "#");
        assertEquals(SILab2.function(initial), expected);
    }
}
