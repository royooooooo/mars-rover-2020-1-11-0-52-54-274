package com.thoughtworks.marsrover;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MarsRoverTest {

  @Test
  public void should_init_position_and_direction_given_initial_command() {
    new MarsRover(0,0,new EastDirection());
  }

  @Test
  public void should_receive_three_kinds_of_action_command() {
    MarsRover marsRover = new MarsRover(0, 0, new EastDirection());
    marsRover.executeCommand(new MoveCommand());
    marsRover.executeCommand(new TurnLeftCommand());
    marsRover.executeCommand(new TurnRightCommand());
  }

  @Test
  public void should_move_to_right_place_given_move_command() {
    MarsRover marsRover = new MarsRover(0, 0, new EastDirection());
    marsRover.executeCommand(new MoveCommand());
    assertEquals(marsRover.getCurrentLocation(), "1, 0, E");
  }

  @Test
  public void should_correctly_execute_the_turn_left_direction_command() {
    MarsRover marsRover = new MarsRover(0, 0, new EastDirection());
    marsRover.executeCommand(new TurnLeftCommand());
    assertEquals(marsRover.getCurrentLocation(), "0, 0, N");

    marsRover.executeCommand(new TurnLeftCommand());
    assertEquals(marsRover.getCurrentLocation(), "0, 0, W");
  }

  @Test
  public void should_correctly_execute_the_turn_right_direction_command() {
    MarsRover marsRover = new MarsRover(0, 0, new EastDirection());
    marsRover.executeCommand(new TurnRightCommand());
    assertEquals(marsRover.getCurrentLocation(), "0, 0, S");

    marsRover.executeCommand(new TurnRightCommand());
    assertEquals(marsRover.getCurrentLocation(), "0, 0, W");
  }

  @Test
  public void should_correctly_execute_multiple_command() {
    MarsRover marsRover = new MarsRover(0, 0, new EastDirection());
    marsRover.executeCommand(new MoveCommand());
    marsRover.executeCommand(new MoveCommand());
    marsRover.executeCommand(new TurnLeftCommand());
    marsRover.executeCommand(new MoveCommand());
    marsRover.executeCommand(new TurnLeftCommand());
    marsRover.executeCommand(new MoveCommand());
    marsRover.executeCommand(new TurnRightCommand());
    marsRover.executeCommand(new TurnRightCommand());
    marsRover.executeCommand(new MoveCommand());

    assertEquals(marsRover.getCurrentLocation(), "2, 1, E");
  }
}
