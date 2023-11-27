package ru.legeu;

import org.junit.Test;
import ru.legeu.game.Player;
import ru.legeu.game.Slot;
import ru.legeu.game.Board;

public class BoardTest {

    @Test
    public void test() {
        Board board = new Board();

        System.out.println(board.action(new Player('X'), Slot.SLOT_3));
        System.out.println(board.action(new Player('X'), Slot.SLOT_5));
        System.out.println(board.action(new Player('X'), Slot.SLOT_7));

        System.out.println(board);
    }
}
