package ru.legeu.game;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private final char[][] slots;
    private char winner;

    public Board() {
        this.slots = new char[][] {
                {'#', '#', '#'},
                {'#', '#', '#'},
                {'#', '#', '#'}
        };
        this.winner = '#';
    }

    public boolean isEmpty(Slot slot) {
        return this.slots[slot.getLeft()][slot.getDown()] == '#';
    }

    public int action(Player player, Slot slot) {
        char symbol = player.getSymbol();
        if (!isEmpty(slot)) return 0;
        this.slots[slot.getLeft()][slot.getDown()] = symbol;
        if (checkWin(symbol)) {
            this.winner = symbol;
            return 2;
        }
        return 1;
    }

    // высшая математика
    private boolean checkWin(char symbol) {
        for (int i = 0; i < slots.length; i++)
            if (slots[i][0] == symbol && slots[i][1] == symbol && slots[i][2] == symbol) return true;
        for (int i = 0; i < slots.length; i++)
            if (slots[0][i] == symbol && slots[1][i] == symbol && slots[2][i] == symbol) return true;
        return (slots[0][0] == symbol && slots[2][2] == symbol)
                || (slots[0][2] == symbol && slots[2][0] == symbol)
                && slots[1][1] == symbol;
    }

    public String getLine(int line) {
        return slots[line][0] + "" + slots[line][1] + slots[line][2];
    }

    public List<String> getLines() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 3; i++)
            list.add(getLine(i));
        return list;
    }

//    public char getCharBySlot(int slot) {
//        int i = 0;
//        if (slot >= 2 && slot < 5) i = 1;
//        else if (slot >= 5) i = 2;
//
//        int j = slot % 3;
//
//        return slots[i][j];
//    }

    public char getWinner() {
        return winner;
    }

    public char[][] getSlots() {
        return slots;
    }

    @Override
    public String toString() {
        var string = new StringBuilder();
        for (String line : getLines())
            string.append(line).append("\n");
        return string.toString();
    }
}
