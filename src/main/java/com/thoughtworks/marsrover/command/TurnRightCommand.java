package com.thoughtworks.marsrover.command;

import com.thoughtworks.marsrover.MarsRover;

public class TurnRightCommand implements Command{

  @Override
  public void doOperate(MarsRover marsRover) {
    marsRover.getFacing().turnRight(marsRover);
  }
}
