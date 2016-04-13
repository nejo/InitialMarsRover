package com.dodevjutsu.kata.marsrover;

public class Rover {
    private String direction;
    private Coordinates coordinates;

    public Rover(String direction, int x, int y) {

        this.direction = direction;
        this.coordinates = new Coordinates(x, y);
    }

    public void receive(String commandSequence) {
        if (commandSequence.equals("")) {
            return;
        }

        if (direction.equals("N")) {
            this.coordinates = coordinates.add(new Coordinates(0, 1));
        } else {
            this.coordinates = coordinates.add(new Coordinates(0, -1));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rover rover = (Rover) o;

        if (direction != null ? !direction.equals(rover.direction) : rover.direction != null) return false;
        return coordinates != null ? coordinates.equals(rover.coordinates) : rover.coordinates == null;

    }

    @Override
    public int hashCode() {
        int result = direction != null ? direction.hashCode() : 0;
        result = 31 * result + (coordinates != null ? coordinates.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Rover{" +
                "direction='" + direction + '\'' +
                ", coordinates=" + coordinates +
                '}';
    }
}
