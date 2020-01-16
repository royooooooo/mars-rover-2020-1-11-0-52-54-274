package com.thoughtworks.marsrover.command;

import com.thoughtworks.marsrover.MarsRover;

public class MoveCommand implements Command{

  @Override
  public void doOperate(MarsRover marsRover) {
    marsRover.getFacing().move(marsRover);
  }
}
