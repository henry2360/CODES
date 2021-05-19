package Tdd;
import Tdd.Pen;
import Tdd.Direction;
import Tdd.Position;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Tdd.Direction.*;
import static javax.swing.SwingConstants.NORTH;
import static org.junit.jupiter.api.Assertions.*;


public class TurtleTest {
    Pen pen;
    Turtle turtle;

    @BeforeEach
    void beginAllTestWith() {
        pen = new Pen();
        turtle = new Turtle(pen);
    }

    @Test
    void Turtle_has_a_pen() {
        Pen blackpen = new Pen();

        assertNotNull(turtle.getPen());
        assertEquals(pen, turtle.getPen());
        assertNotEquals(blackpen, turtle.getPen());
    }

    @Test
    void turtleCanMovePenUp(){
        turtle.moveUp();
        assertTrue(turtle.isPenUp());
    }
    @Test
    void turtle_Can_Move_Pen_Down () {
        assertTrue(turtle.isPenUp());
        turtle.move_Pen_Down();
        assertFalse(turtle.isPenUp());
    }
    @Test
    void turtleCanCheckRightWhileFacing_East (){
        assertSame(EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanTurnRightWhileFacingSouth () {
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());

        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanTurnRightWhileFacing_West() {
        turtle.turnRight();
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(NORTH, turtle.getCurrentDirection());

    }
    @Test
    void turtleCanMoveForwardFacingEast () {
        turtle.turnRight();
        assertSame(EAST, turtle.getCurrentDirection());
        turtle.moveForwardBy(5);
        assertEquals(new Position(0,5), turtle.getCurrentPosition());
    }



    @AfterEach
    void tearDown() {
    }

}

