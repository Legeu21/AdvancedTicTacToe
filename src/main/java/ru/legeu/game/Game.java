package ru.legeu.game;

import java.util.Collection;
import java.util.HashSet;

public class Game {

    private final Collection<Player> players = new HashSet<>(1);
    private final Table table;

    public Game() {
        this.table = new Table();
    }

    public void startGame() {
        players.add(new Player('X'));
        players.add(new Player('O'));
    }

    public void stopGame() {
        players.clear();
    }

    public Collection<Player> getPlayers() {
        return players;
    }

    public Table getTable() {
        return table;
    }
}
