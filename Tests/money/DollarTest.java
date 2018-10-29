package money;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DollarTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
