package com.dodevjutsu.kata.marsrover;

/**
 * Created by alcornejo on 4/13/16.
 */
public class Coordinates {
    private final int x;
    private final int y;

    public Coordinates(int x, int y) {

        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coordinates that = (Coordinates) o;

        if (x != that.x) return false;
        return y == that.y;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Coordinates add(Coordinates other) {
        return new Coordinates(x + other.x, y + other.y);
    }
}
