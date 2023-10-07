import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main;

    @BeforeEach
    void setUp() {
        main = new Main();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addForSuccess() {
        assertEquals(2, main.add(1, 1));
    }

    @Test
    void addForSuccess1() {
        assertEquals(1, main.add(1, 1));
    }
}