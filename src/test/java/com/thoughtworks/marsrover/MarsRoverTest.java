package com.thoughtworks.marsrover;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MarsRoverTest {

  @Test
  public void should_init_mars_rover_given_position_and_direction() {
    MarsRover marsRover = new MarsRover(0, 0, Direction.N);
    assertEquals(marsRover.getCurrentPositionAndDirection(), "0, 0, N");
  }
}
