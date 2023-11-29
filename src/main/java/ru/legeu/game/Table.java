package ru.legeu.game;

import java.util.ArrayList;
import java.util.List;

public class Table {

    private final List<Board> boards = new ArrayList<>(8);

    public Table() {
        for (int i = 0; i < 9; i++)
            boards.add(new Board());
    }

    public List<Board> getBoards() {
        return boards;
    }

    @Override
    public String toString() {
        String string = "";
        int index = 0;


        for (int i = 0; i < 3; i++) {
            string += "\n";
            for (int j = 0; j < 3; j++) {

                string += "\n";
                for (int k = 0; k < 3; k++) {
                    string += boards.get(index).getLine(k);
                }
                index++;
            }
        }

        return string;
    }
}
