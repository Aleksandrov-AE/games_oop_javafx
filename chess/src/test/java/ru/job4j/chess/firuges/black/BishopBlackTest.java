package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void testPosition() {
        Cell in = Cell.G2;
        Figure BishopB = new BishopBlack(in);
        Cell expected = BishopB.position();
        boolean result = (expected.getX() == in.getX() && expected.getY() == in.getY());
        Assert.assertTrue(result);
    }

    @Test
    public void testCopy() {
        Figure in = new BishopBlack(Cell.G4);
        Figure out = in.copy(Cell.G8);
        boolean result = (out.position().getX() == Cell.G8.getX() && out.position().getY() == Cell.G8.getY());
        Assert.assertTrue(result);

    }

    @Test
    public void testWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] route = bishopBlack.way(Cell.G5);
        Assert.assertArrayEquals(route,new Cell[] {Cell.D2,Cell.E3, Cell.F4, Cell.G5});
    }
}