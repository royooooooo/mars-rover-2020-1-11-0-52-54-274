package com.thoughtworks.marsrover.command;

import com.thoughtworks.marsrover.RoverStatus;

public class TurnRightCommand implements Command {

  @Override
  public RoverStatus doOperate(RoverStatus roverStatus) {
    return roverStatus.getFacing().turnRight(roverStatus);
  }
}
