package ru.legeu;

import org.junit.Test;
import ru.legeu.game.Player;
import ru.legeu.game.Slot;
import ru.legeu.game.Table;

public class TableTest {

    @Test
    public void test() {
        var table = new Table();
        table.getBoard(0).action(new Player('X'), Slot.SLOT_1);
        System.out.println(table);
    }
}
