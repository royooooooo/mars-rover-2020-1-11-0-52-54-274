package com.thoughtworks.marsrover.command;

import com.thoughtworks.marsrover.RoverStatus;

public class MoveCommand implements Command {

  @Override
  public void doOperate(RoverStatus roverStatus) {
    roverStatus.getFacing().move(roverStatus);
  }
}
