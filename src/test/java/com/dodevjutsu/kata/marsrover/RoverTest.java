package com.dodevjutsu.kata.marsrover;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RoverTest {
    @Test
    public void notMovingWhenReceivingEmptyCommandSequence() {
        Rover rover = new Rover("N",1,1);

        rover.receive("");

        assertThat(rover, is(new Rover("N",1,1)));
    }

    @Test
    public void movingForwardWhenFacingNorth() {
        Rover rover = new Rover("N",1,1);

        rover.receive("f");

        assertThat(rover, is(new Rover("N",1,2)));
    }

}
