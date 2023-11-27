package ru.legeu;

import org.junit.Test;
import ru.legeu.game.Board;
import ru.legeu.game.Player;
import ru.legeu.game.Slot;
import ru.legeu.game.Table;

public class TableTest {

    @Test
    public void test() {
        Table table = new Table();
        for (Board board : table.getBoards())
            board.action(new Player('X'), Slot.SLOT_1);
        System.out.print(table);
    }
}
