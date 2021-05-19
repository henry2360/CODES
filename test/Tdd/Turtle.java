package Tdd;


import static Tdd.Direction.*;

public class Turtle {

    private final Pen pen;
    private Direction currentDirection ;
    private Position currentPosition;

    public Turtle (Pen turtlePen){
        currentDirection = EAST;
        this.pen = turtlePen;
    }


    public Pen getPen() {
        //Pen blackPen = new Pen();
        return pen;
    }

    public void moveUp() {
        pen.setIsUp(true);
    }

    public boolean isPenUp() {
        return pen.isUp();
    }

    public void move_Pen_Down() {
        pen.setIsUp(false);
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        switch (currentDirection) {
            case EAST -> currentDirection = SOUTH;
            case WEST -> currentDirection = NORTH;
            case SOUTH -> currentDirection = WEST;
            case NORTH -> currentDirection = EAST;
        }

    }
    public void moveForwardBy (int numberOfSteps ) {
        switch  (currentDirection) {
            case EAST :
                currentDirection.increaseColumnPositionBy(numberOfSteps);
        }
    }
    public Position getCurrentPosition() {
        return currentPosition;
    }
}



