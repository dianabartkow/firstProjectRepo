package com.company;

public enum Effectiveness {
    LOW(60),
    MEDIUM(90),
    HIGH(120);

    private int level;


    Effectiveness(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
