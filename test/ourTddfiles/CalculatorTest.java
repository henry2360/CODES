package ourTddfiles;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void addTwoNumbersTest(){
-
        Calculator calculator = new Calculator();

        int sum = calculator.add(2,3);

        assertEquals(5,calculator.add(2,3));
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
}