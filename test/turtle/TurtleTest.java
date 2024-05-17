package turtle;

import ijapa.Turtle;
import ijapa.TurtlePosition;
import ijapa.SketchBoard;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ijapa.Direction.*;

class TurtleTest {

    @Test
    public void testThatPenIsUp() {
        Turtle ijapa = new Turtle();
        ijapa.penIsUp();
        assertTrue(ijapa.penIsUp());
    }

    @Test
    public void testThatPenIsDown() {
        Turtle ijapa = new Turtle();
        ijapa.penDown();
        assertFalse(ijapa.penIsUp());
    }

    @Test
    public void testThatTurtleCanMovePenUp() {
        Turtle ijapa = new Turtle();
        ijapa.moveUpTurtle();
        assertTrue(ijapa.penIsUp());
    }

    @Test
    public void testThatTurtleCanMovePenDown() {
        Turtle ijapa = new Turtle();
        ijapa.moveDownTurtle();
        assertFalse(ijapa.penDown());
    }

    @Test
    public void testThatTurtleIsFacingEast_CanTurnLeftFacingNorth() {
        Turtle ijapa = new Turtle();
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(NORTH, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleIsFacingNorth_CanTurnLeftFacingWest() {
        Turtle ijapa = new Turtle();
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(NORTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(WEST, ijapa.getCurrentDirection());
    }


    @Test
    public void testThatTurtleIsFacingWest_CanTurnLeftFacingSouth() {
        Turtle ijapa = new Turtle();
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(WEST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleIsFacingSouth_CanTurnLeftFacingEast() {
        Turtle ijapa = new Turtle();
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(EAST, ijapa.getCurrentDirection());
    }


    @Test
    public void testThatTurtleIsFacingEast_CanTurnRightFacingSouth() {
        Turtle ijapa = new Turtle();
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleIsFacingSouth_CanTurnRightFacingWest() {
        Turtle ijapa = new Turtle();
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleIsFacingWest_CanTurnRightFacingNorth() {
        Turtle ijapa = new Turtle();
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(NORTH, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleIsFacingNorth_CanTurnRightFacingEast() {
        Turtle ijapa = new Turtle();
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(NORTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(EAST, ijapa.getCurrentDirection());
    }


    @Test
    public void testThatTurtlePositionIsAtZero_RowAndColumn_LocationIsEast() {
        Turtle ijapa = new Turtle();
        assertSame(EAST, ijapa.getCurrentDirection());
        assertEquals(new TurtlePosition(0, 0), ijapa.getCurrentPosition());
    }

    @Test
    public void testThatTurtleMoveFacingEast() {
        Turtle ijapa = new Turtle();
        assertSame(EAST, ijapa.getCurrentDirection());
        assertEquals(new TurtlePosition(0, 0), ijapa.getCurrentPosition());
        ijapa.move(5);
        assertEquals(new TurtlePosition(0, 4), ijapa.getCurrentPosition());
    }

    @Test
    public void testThatTurtleMoveFacingSouth() {
        Turtle ijapa = new Turtle();
        ijapa.move(5);
        assertEquals(new TurtlePosition(0, 4), ijapa.getCurrentPosition());
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.move(5);
        assertEquals(new TurtlePosition(4, 4), ijapa.getCurrentPosition());
    }

    @Test
    public void testThatTurtleMoveFacingWest() {
        Turtle ijapa = new Turtle();
        assertSame(EAST, ijapa.getCurrentDirection());
        assertEquals(new TurtlePosition(0, 0), ijapa.getCurrentPosition());
        ijapa.move(5);
        assertEquals(new TurtlePosition(0, 4), ijapa.getCurrentPosition());
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.move(5);
        assertEquals(new TurtlePosition(4, 4), ijapa.getCurrentPosition());
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
        ijapa.move(5);
        assertEquals(new TurtlePosition(4, 0), ijapa.getCurrentPosition());

    }


    @Test
    public void testThatTurtleMoveFacingNorth() {
        Turtle ijapa = new Turtle();
        assertSame(EAST, ijapa.getCurrentDirection());
        assertEquals(new TurtlePosition(0, 0), ijapa.getCurrentPosition());
        ijapa.move(5);
        assertEquals(new TurtlePosition(0, 4), ijapa.getCurrentPosition());
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.move(5);
        assertEquals(new TurtlePosition(4, 4), ijapa.getCurrentPosition());
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
        ijapa.move(5);
        assertEquals(new TurtlePosition(4, 0), ijapa.getCurrentPosition());
        ijapa.turnRight();
        assertSame(NORTH, ijapa.getCurrentDirection());
        ijapa.move(5);
        assertEquals(new TurtlePosition(0, 0), ijapa.getCurrentPosition());
    }

    @Test
    public void testThatIjapaCanMoveFromNorthToWest() {
        Turtle ijapa = new Turtle();
        ijapa.turnRight();
        ijapa.move(5);
        assertEquals(new TurtlePosition(4, 0), ijapa.getCurrentPosition());
        ijapa.turnLeft();
        ijapa.move(2);
        assertEquals(new TurtlePosition(4, 1), ijapa.getCurrentPosition());
        ijapa.turnLeft();
        ijapa.move(2);
        assertEquals(new TurtlePosition(3, 1), ijapa.getCurrentPosition());
        ijapa.turnLeft();
        ijapa.move(2);
        assertEquals(new TurtlePosition(3, 0), ijapa.getCurrentPosition());
        ijapa.turnLeft();
        ijapa.move(2);
        assertEquals(new TurtlePosition(4, 0), ijapa.getCurrentPosition());
    }

    @Test
    public void testThatIjapaCanMove10TimesWhenPenIsUp() {
        Turtle ijapa = new Turtle();
        assertTrue(ijapa.penIsUp());
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.move(5);
        assertEquals(new TurtlePosition(0, 4), ijapa.getCurrentPosition());
        int[][] expected = SketchBoard.getBoard();
        assertEquals(0, expected[0][0]);
        assertEquals(0, expected[0][1]);
        assertEquals(0, expected[0][2]);
        assertEquals(0, expected[0][3]);
        assertEquals(0, expected[0][4]);
        assertEquals(0, expected[0][5]);
        assertEquals(0, expected[0][6]);
        assertEquals(0, expected[0][7]);
        assertEquals(0, expected[0][8]);
        assertEquals(0, expected[0][9]);

    }


    @Test
    public void turtleGraphicCanDisplayWithAsterick() {
        Turtle ijapa = new Turtle();
        ijapa.penDown();
        ijapa.move(5);
        SketchBoard.displayBoard();
    }


    @Test
    public void turtleCanSquareWithAsterick() {
        Turtle ijapa = new Turtle();
        ijapa.penDown();
        ijapa.move(20);
        ijapa.turnRight();
        ijapa.move(20);
        ijapa.turnRight();
        ijapa.move(20);
        ijapa.turnRight();
        ijapa.move(20);


    }


}