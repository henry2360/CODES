package Tdd;

import kata.KataOfArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayTest {
    @Test
    void testForSumOfArray(){
        int[] array = {1,2,3,4};
       assertEquals(10, KataOfArray.getSumOfArray(array));
    }
    @Test
    void testForAverageOfArray() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(3, KataOfArray.getAverage(array));
    }

    @Test
     void testMaximumOfArray(){
        int[] array = { 1,2,3,4,5};
        assertEquals(5, KataOfArray.getMaximum(array));
        }
   @Test
    void testForMinimumOfArray(){
     int[] array = {1,2,3,4,5};
      assertEquals(1,KataOfArray.getMinValue(array));
   }



@Test
void testMaximumSumOfArray() {
    int[] array = {1, 2, 3, 4, 5};
    assertEquals(14, KataOfArray.maximumSumOfArray(array));
}
@Test
        void testMinimumSumOfArray(){
    int[] array ={ 1,2,3,4,5};
    assertEquals( 10,KataOfArray.minimumSumOfArray(array) );

    }
    }
