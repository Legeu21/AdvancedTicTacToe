package ru.legeu.game;
public enum Slot {

    SLOT_1(0, 0),
    SLOT_2(0, 1),
    SLOT_3(0, 2),
    SLOT_4(1, 0),
    SLOT_5(1, 1),
    SLOT_6(1, 2),
    SLOT_7(2, 0),
    SLOT_8(2, 1),
    SLOT_9(2, 2);

    private final int left, down;

    Slot(int left, int down) {
        this.left = left;
        this.down = down;
    }

    public int getLeft() {
        return left;
    }

    public int getDown() {
        return down;
    }
}
