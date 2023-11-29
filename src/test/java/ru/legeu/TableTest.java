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
        Board board = table.getBoards().get(0);
        Player player = new Player('X');

        System.out.println("1й");
        board.action(player, Slot.SLOT_1);
        System.out.println(table);

        System.out.println("2й");
        board.action(player, Slot.SLOT_2);
        System.out.println(table);

        System.out.println("3й");
        board.action(player, Slot.SLOT_3);
        System.out.println(table);

        System.out.println("4й");
        board.action(player, Slot.SLOT_4);
        System.out.println(table);

        System.out.println("5й");
        board.action(player, Slot.SLOT_5);
        System.out.println(table);

        System.out.println("6й");
        board.action(player, Slot.SLOT_6);
        System.out.println(table);

        System.out.println("7й");
        board.action(player, Slot.SLOT_7);
        System.out.println(table);

        System.out.println("8й");
        board.action(player, Slot.SLOT_8);
        System.out.println(table);

        System.out.println("9й");
        board.action(player, Slot.SLOT_9);
        System.out.println(table);
    }
}
