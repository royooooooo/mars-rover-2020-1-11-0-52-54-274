package com.thoughtworks.marsrover.command;

import com.thoughtworks.marsrover.MarsRover;

public class TurnLeftCommand implements Command{

  @Override
  public void doOperate(MarsRover marsRover) {
    marsRover.getFacing().turnLeft(marsRover);
  }
}
