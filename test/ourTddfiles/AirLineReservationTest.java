package ourTddfiles;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
sit cannot be assigned to more than one person

 */

public class AirLineReservationTest {
  AirLineReservation airline;
    @BeforeEach
    void beforeEach() {
        airline = new AirLineReservation();
    }

    @AfterEach
    void afterEach() {
        airline = null;
    }
    @Test
    void Airline_Can_Assign_Seats_First_Class(){
//        boolean[] expectedSeats = new boolean[10];
//        expectedSeats[5] = true;
//        expectedSeats[6] = true;
        airline.assignSeat("first-class");
        airline.assignSeat("first-class");
        airline.assignSeat("economy");
        assertArrayEquals(new boolean[]{true,true,false,false,false,true,false,false,false,false}, airline.getSeatingArrangement());
    }
    @Test
    void Airline_Can_Assign_Seats_Economy_Class(){
        boolean [] assignSeat = new boolean[10];
        assignSeat[5]= true;
        airline.assignSeat("economy");
        assertArrayEquals(assignSeat,airline.getSeatingArrangement());

    }
    @Test
    void Check_Free_Seat_For_User(){
        boolean [] expectedSeatArrangement = new boolean[10];
        expectedSeatArrangement[0]= true;
        expectedSeatArrangement[5]= true;
        expectedSeatArrangement[6]= true;
        expectedSeatArrangement[7]= true;
        expectedSeatArrangement[8]= true;
        expectedSeatArrangement[9]= true;

        airline.assignSeat("economy");
        airline.assignSeat("economy");
        airline.assignSeat("economy");
        airline.assignSeat("economy");
        airline.assignSeat("economy");
        airline.assignSeat("economy");



        assertArrayEquals(expectedSeatArrangement,airline.getSeatingArrangement());
    }

}
