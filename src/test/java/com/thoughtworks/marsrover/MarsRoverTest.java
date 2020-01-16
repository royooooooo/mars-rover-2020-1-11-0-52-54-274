package com.thoughtworks.marsrover;

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


}
