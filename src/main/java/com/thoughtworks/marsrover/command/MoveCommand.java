package com.thoughtworks.marsrover.command;

import com.thoughtworks.marsrover.RoverStatus;

public class MoveCommand implements Command {

  @Override
  public RoverStatus doOperate(RoverStatus roverStatus) {
    return roverStatus.getFacing().move(roverStatus);
  }
}
