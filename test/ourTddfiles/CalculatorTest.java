package ourTddfiles;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void addTwoNumbersTest(){

        Calculator calculator = new Calculator();

        int sum = calculator.add(2,3);

        assertEquals(5, calculator.add(2,3));
        assertEquals(12, calculator.add(6,6));
    }

    @Test
    @DisplayName("Test for calculating Multiplication")
    void testToMultiplyTwoNumbers(){

        Calculator calculator = new Calculator();

        int multiply = calculator.multiply(2,3);

        assertEquals(6, calculator.multiply(2,3));


    }

     @Test
     @DisplayName("Test for calculating Division")
     void testToDivideTwoNumbers(){

     Calculator calculator =new Calculator();
     assertEquals(5 ,  calculator.divide(10 ,2) );

     }

    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName(" Two number can be divided")
    void divideTwoNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(2.5,calculator.divide(5,2));

    }

    @AfterEach
    void tearDown() {
    }
}

