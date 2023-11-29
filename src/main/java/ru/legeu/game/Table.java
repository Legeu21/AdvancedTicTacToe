package ru.legeu.game;

import java.util.ArrayList;
import java.util.List;

public class Table {

    private final List<Board> boards = new ArrayList<>(8);

    public Table() {
        for (int i = 0; i < 9; i++)
            boards.add(new Board());
    }

    public Board getBoard(int index) {
        return boards.get(index);
    }

    public List<Board> getBoards() {
        return boards;
    }
}
