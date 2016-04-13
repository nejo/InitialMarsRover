package com.dodevjutsu.kata.marsrover;

public class Rover {
    private String direction;
    private int x;
    private int y;

    public Rover(String direction, int x, int y) {

        this.direction = direction;
        this.x = x;
        this.y = y;
    }

    public void receive(String commandSequence) {
        if (commandSequence.equals("")) {
            return;
        }

        if (direction.equals("N")) {
            y += 1;
        } else {
            y -=1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rover rover = (Rover) o;

        if (x != rover.x) return false;
        if (y != rover.y) return false;
        return direction != null ? direction.equals(rover.direction) : rover.direction == null;

    }

    @Override
    public int hashCode() {
        int result = direction != null ? direction.hashCode() : 0;
        result = 31 * result + x;
        result = 31 * result + y;
        return result;
    }

    @Override
    public String toString() {
        return "Rover{" +
                "direction='" + direction + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
