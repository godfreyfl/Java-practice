package ru.mirea.lab4;

class Hand {
    private int fingerCount;
    private boolean hasScar;

    public Hand(int fingerCount, boolean hasScar) {
        this.fingerCount = fingerCount;
        this.hasScar = hasScar;
    }

    public int getFingerCount() {
        return fingerCount;
    }

    public boolean hasThumb() {
        return hasScar;
    }
}
