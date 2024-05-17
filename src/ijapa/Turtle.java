package ijapa;

import static ijapa.Direction.*;

public class Turtle {

    private boolean penIsUp = true;
    private boolean penDown = true;

    private Direction currentDirection = EAST;
    private TurtlePosition currentPosition = new TurtlePosition(0, 0);;

    public boolean penIsUp() {
        return penIsUp;

    }

    public boolean penDown() {
        return penIsUp = false;
    }


    public boolean moveUpTurtle() {
        return penDown = false;
    }

    public boolean moveDownTurtle() {
        return penDown;

    }

    public Direction getCurrentDirection(){
        return currentDirection;

    }
    public void turnLeft() {
        currentDirection = currentDirection.turnLeft();
    }

    public void turnRight() {
        currentDirection = currentDirection.turnRight();
    }

    public void move(int numberOfStep){
        if (!penIsUp) drawOnBoard(numberOfStep);
        switch (currentDirection){
            case EAST -> moveEast(numberOfStep);
            case SOUTH -> moveSouth(numberOfStep);
            case WEST -> moveWest(numberOfStep);
            case NORTH -> moveNorth(numberOfStep);
        }

    }

    private void moveNorth(int numberOfStep) {
        int row = currentPosition.getRow() - numberOfStep + 1;
        int column = currentPosition.getColumn();
        currentPosition = new TurtlePosition(row, column);
    }

    private void moveWest(int numberOfStep) {
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn() - numberOfStep + 1;
        //System.out.println(column);
        currentPosition = new TurtlePosition(row, column);
    }

    private void moveSouth(int numberOfStep) {
        int row = currentPosition.getRow() + numberOfStep - 1 ;
        int column = currentPosition.getColumn() ;
        //System.out.println(row);
        currentPosition = new TurtlePosition(row, column);
    }

    private void moveEast(int numberOfStep) {
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn() + numberOfStep - 1;
        //System.out.println(column);
        currentPosition = new TurtlePosition(row, column);
    }

    private void drawOnBoard( int numberOfSteps) {
        SketchBoard sketchBoard = new SketchBoard();
        int[][] floorBoard = sketchBoard.getBoard();

//        switch (currentDirection) {
//            case EAST:
//                markEastWard(floorBoard, numberOfSteps);
//                break;
//            case SOUTH:
//                markSouthWard(floorBoard, numberOfSteps);
//                break;
//            case WEST:
//                markWestWard(floorBoard, numberOfSteps);
//                break;
//            case NORTH:
//                markNorthWard(floorBoard, numberOfSteps);
//                break;
//        }
    }



    public TurtlePosition getCurrentPosition() {
        return currentPosition;
    }


}
