package com.thoughtworks.marsrover;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MarsRoverTest {

  @Test
  public void should_init_mars_rover_given_position_and_direction() {
    MarsRover marsRover = new MarsRover(0, 0, Direction.N);
    assertEquals(marsRover.getCurrentPositionAndDirection(), "0, 0, N");
  }

  @Test
  public void should_accept_init_command() {
    MarsRover marsRover = new MarsRover("0, 1, S");
    assertEquals(marsRover.getCurrentPositionAndDirection(), "0, 1, S");
  }

  @Test
  public void should_correctly_execute_the_move_command() {
    MarsRover marsRover = new MarsRover("0, 1, S");
    marsRover.executeCommand(Command.Move);
    assertEquals(marsRover.getCurrentPositionAndDirection(), "0, 0, S");
  }

  @Test
  public void should_correctly_execute_the_direction_command() {
    MarsRover marsRover = new MarsRover("0, 1, S");
    marsRover.executeCommand(Command.L);
    assertEquals(marsRover.getCurrentPositionAndDirection(), "0, 1, E");
    marsRover.executeCommand(Command.R);
    assertEquals(marsRover.getCurrentPositionAndDirection(), "0, 1, S");
  }
}
